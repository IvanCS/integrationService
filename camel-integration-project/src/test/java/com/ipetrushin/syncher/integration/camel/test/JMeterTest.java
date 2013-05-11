package com.ipetrushin.syncher.integration.camel.test;

import org.apache.commons.io.IOUtils;
import org.apache.jmeter.JMeter;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 08.05.13
 * Time: 16:39
 * To change this template use File | Settings | File Templates.
 */
public class JMeterTest {

    private static final Pattern PAT_ERROR = Pattern.compile(".*\\s+ERROR\\s+.*");


    private File srcDir;
    /**
     * @parameter expression="jmeter-reports"
     */
    private File reportDir;
    /**
     * @parameter expression="${basedir}/src/test/jmeter/jmeter.properties"
     */
    private File jmeterProps;
    /**
     * @parameter
     */
    private boolean remote;
    private File workDir;
    private File saveServiceProps, upgradeProps;
    private File jmeterLog;


    private boolean checkForErrors() throws Exception {
        boolean isError = false;
        try {
            BufferedReader in = new BufferedReader(new FileReader(jmeterLog)); String line; while ( (line = in.readLine()) != null) {
                if (PAT_ERROR.matcher(line).find()) {
                   // throw new Exception("There were test errors");
                    isError = true;
                }
            } in.close();
        } catch (IOException e) {
            throw new Exception("Can't read log file", e);
        }

        return isError;
    }

    private void initSystemProps() throws Exception {
        workDir = new File("target" + File.separator + "jmeter");
        workDir.mkdirs();
        createSaveServiceProps();
        jmeterLog = new File(workDir, "jmeter.log");
        try {
            System.setProperty("log_file", jmeterLog.getCanonicalPath());
        } catch (IOException e) {
            throw new Exception("Can't get canonical path for log file", e);
        }
    }

    /**
     * This mess is necessary because JMeter must load this info from a file.
     * Resources won't work.
     */
    private void createSaveServiceProps() throws Exception {
        saveServiceProps = new File(workDir, "saveservice.properties");
        upgradeProps =   new File(workDir, "upgrade.properties");
        try {
            FileWriter out = new FileWriter(saveServiceProps);
            IOUtils.copy(Thread.currentThread().getContextClassLoader().getResourceAsStream("saveservice.properties"), out);

            out.flush();
            out.close();


            System.setProperty("saveservice_properties",
                    File.separator + "target" + File.separator + "jmeter" + File.separator + "saveservice.properties");

        } catch (IOException e) {
            throw new Exception("Could not create temporary saveservice.properties", e);
        }
    }

    @Test
    @Ignore
    public void jmeter() throws Exception {
        JMeter jMeter = new JMeter();

        try {

            List<String> args = Arrays.asList("-n",
                    "-t", "C:/BeanShellAssertion.jmx", "-l", "C:/BeanShellAssertion_report.jtl", "-p", "C:\\Users\\ipetrush\\Desktop\\apache-jmeter-2.8\\bin\\jmeter.properties", "-d", System.getProperty("user.dir"));

                initSystemProps();
            // This mess is necessary because JMeter likes to use System.exit. // We need to trap the exit call.
          /*  SecurityManager oldManager = System.getSecurityManager();
            System.setSecurityManager(new SecurityManager() {
                @Override
                public void checkExit(int status) {

                }

                @Override
                public void checkPermission(Permission perm, Object context) {
                }

                @Override
                public void checkPermission(Permission perm) {
                }
            });

            Thread.UncaughtExceptionHandler oldHandler = Thread.getDefaultUncaughtExceptionHandler();

            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                public void uncaughtException(Thread t, Throwable e) {
                    //if (e instanceof ExitException && ((ExitException) e).getCode() == 0) {
                    // return; //Ignore
                    // } //getLog().error("Error in thread " + t.getName());
                }
            });
              */
            try {
                // This mess is necessary because the only way to know when JMeter // is done is to wait for all of the threads that it spawned to exit.
                int startThreadCount = Thread.activeCount();

                jMeter.start(args.toArray(new String[]{}));
                int activeThreadCount;

                Thread.sleep(10000);
                //Assert.assertFalse(checkForErrors());

                /*
                while ((activeThreadCount = Thread.activeCount()) > startThreadCount) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        break;
                    }
                }
                */
            } catch (Exception e) {

                throw new Exception("Test failed");

            } finally {
                // System.setSecurityManager(oldManager);
                //  Thread.setDefaultUncaughtExceptionHandler(oldHandler);
            }
        } catch (IOException e) {
            throw new Exception("Can't execute test");
        }


    }
}
