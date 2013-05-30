package com.ipetrushin.syncher.integration.camel.beans;


import org.apache.commons.io.IOUtils;
import org.apache.jmeter.JMeter;
import org.apache.jmeter.NewDriver;
import org.slf4j.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.Permission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 15.05.13
 * Time: 18:58
 * To change this template use File | Settings | File Templates.
 */
public class JMeterRunnerBean {
    private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(JMeterRunnerBean.class);
    boolean isInit;
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

    public JMeterRunnerBean() {
        isInit = false;
    }

    public static List<String> getThreadNames(boolean ofTypeGUI) {
        List<String> threadNames = new ArrayList<String>();
        for (JMeterThread thread : JMeterThread.values()) {
            if (thread.isGUIThread() == ofTypeGUI) {
                threadNames.add(thread.getThreadName());
            }
        }
        return threadNames;
    }

    public void runJMeter(String exchange) {
        if (exchange != null || exchange != "") {
            LOGGER.error("exchange -- " +exchange +"\n");

            LOGGER.error("run jmeeeeeeeteeeerrrr!!!!!");
            try {
                // initSystemProps();
                run();
            } catch (Exception e) {
                LOGGER.error("runJMeter");
                LOGGER.error(e.getMessage() + "\n\n" + e.getStackTrace());
            }
        }
    }

    private void initSystemProps() throws Exception {

        workDir = new File("syncher" + File.separator + "jmeter");

        workDir.mkdirs();
        createSaveServiceProps();
        jmeterLog = new File(workDir, "jmeter.log");
        try {
            System.setProperty("log_file", jmeterLog.getCanonicalPath());
        } catch (IOException e) {
            throw new Exception("Can't get canonical path for log file", e);
        }

        isInit = true;
    }

    /**
     * This mess is necessary because JMeter must load this info from a file.
     * Resources won't work.
     */
    private void createSaveServiceProps() throws Exception {
        saveServiceProps = new File(workDir, "saveservice.properties");
        jmeterProps = new File(workDir, "jmeter.properties");

        try {
            FileWriter out = new FileWriter(saveServiceProps);
            IOUtils.copy(Thread.currentThread().getContextClassLoader().getResourceAsStream("saveservice.properties"), out);

            out.flush();
            out.close();

            out = new FileWriter(jmeterProps);
            IOUtils.copy(Thread.currentThread().getContextClassLoader().getResourceAsStream("jmeter.properties"), out);

            out.flush();
            out.close();

            System.setProperty("saveservice_properties",
                    File.separator + "target" + File.separator + "jmeter" + File.separator + "saveservice.properties");

            System.setProperty("jmeter_properties",
                    File.separator + "target" + File.separator + "jmeter" + File.separator + "jmeter.properties");

        } catch (IOException e) {

            throw new Exception("Could not create temporary saveservice.properties", e);
        }
    }

    private void runTest() throws Exception {
        JMeter jMeter = new JMeter();


        List<String> args = Arrays.asList("-n",
                "-t", "C:\\apache-jmeter-2.9\\bin\\examples\\CSVSample.jmx", "-l", "C:/report.jtl", "-p", "C:\\apache-jmeter-2.9\\bin\\jmeter.properties", "-d", System.getProperty("user.dir"));
        LOGGER.error("List<String> args");

        if (!isInit) {
            initSystemProps();
            LOGGER.error("initSystemProps");
        }


        SecurityManager oldManager = System.getSecurityManager();
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
                LOGGER.error("Error in thread " + t.getName());
                //  if (e instanceof ExitException && ((ExitException)e).getReason() == 0) {
                return; //Ignore
                //}

            }
        });


        // This mess is necessary because the only way to know when JMeter // is done is to wait for all of the threads that it spawned to exit.
        int startThreadCount = Thread.activeCount();

        LOGGER.error("jMeter.start");
        jMeter.start(args.toArray(new String[]{}));
        LOGGER.error("activeThreadCountt");
        int activeThreadCount;
        LOGGER.error(" Thread.sleep");
        Thread.sleep(10000);


        System.setSecurityManager(oldManager);
        Thread.setDefaultUncaughtExceptionHandler(oldHandler);

    }

    private void run2() throws Exception {

        List<String> args = Arrays.asList("-n",
                "-t", "E:\\test.jmx", "-l", "E:\\test_result.jtl", "-p", "E:\\jmeter.properties", "-d", System.getProperty("user.dir"));
        LOGGER.error("List<String> args");


        if (!isInit) {
            initSystemProps();
            LOGGER.error("initSystemProps");
        } else {
            LOGGER.error("is already initSystemProps");
        }


        SecurityManager originalSecurityManager = overrideSecurityManager();
        Thread.UncaughtExceptionHandler originalExceptionHandler = overrideUncaughtExceptionHandler();

        try {

            //Start the test.
            NewDriver.main((String[]) args.toArray());
            LOGGER.error("Start the test");


            waitForTestToFinish(getThreadNames(false));

            LOGGER.error("waitForTestToFinish");

        } catch (ExitException e) {
            LOGGER.error(e.getMessage() + "error new driver");
            if (e.getCode() != 0) {
                LOGGER.error(e.getMessage() + "error new driver1");
                throw new Exception("Test failed", e);

            }
        } catch (InterruptedException ex) {

            LOGGER.error(ex.getMessage() + "error new driver2");
        } finally {
            //TODO wait for child thread shutdown here?
            //TODO kill child threads if waited too long?
            //Reset everything back to normal
            // System.setSecurityManager(originalSecurityManager);
            // Thread.setDefaultUncaughtExceptionHandler(originalExceptionHandler);

            LOGGER.error("COMPLITED");
        }

    }

    private void run() throws Exception{
        Runtime.getRuntime().exec("cmd /c start cmd /k C:\\FuseESBEnterprise-7.1.0\\apache-jmeter-2.9\\bin\\jmeter -n -t C:\\FuseESBEnterprise-7.1.0\\apache-jmeter-2.9\\bin\\examples\\CSVSample.jmx -l C:\\FuseESBEnterprise-7.1.0\\apache-jmeter-2.9\\bin\\examples\\CSVSample.jtl");

    }

    /**
     * Wait for one of the JMeterThreads in the list to stop.
     */
    protected void waitForTestToFinish(List<String> threadNames) throws InterruptedException {
        Thread waitThread = null;


        Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
        for (Thread thread : threadSet) {
            for (String threadName : threadNames) {
                if (threadName.equals(thread.getName())) {
                    waitThread = thread;
                    break;
                }
            }
        }
        if (waitThread != null) {
            // waitThread.setUncaughtExceptionHandler(new JMeterPluginUncaughtExceptionHandler());
            waitThread.join();
        }
    }

    /**
     * Capture System.exit commands so that we can check to see if JMeter is trying to kill us without warning.
     *
     * @return old SecurityManager so that we can switch back to normal behaviour.
     */
    protected SecurityManager overrideSecurityManager() {
        SecurityManager oldManager = System.getSecurityManager();
        System.setSecurityManager(new JMeterPluginSecurityManager());
        return oldManager;
    }

    /**
     * Override System.exit(0) to ensure JMeter doesn't kill us without warning.
     *
     * @return old UncaughtExceptionHandler so that we can switch back to normal behaviour.
     */
    protected Thread.UncaughtExceptionHandler overrideUncaughtExceptionHandler() {
        Thread.UncaughtExceptionHandler oldHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new JMeterPluginUncaughtExceptionHandler());
        return oldHandler;
    }

    public class JMeterPluginUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
        public void uncaughtException(Thread t, Throwable e) {
            if (e instanceof ExitException && ((ExitException) e).getCode() == 0) {
                return; // Ignore
            }
        }
    }
}
