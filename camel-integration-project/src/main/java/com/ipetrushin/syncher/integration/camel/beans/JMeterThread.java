package com.ipetrushin.syncher.integration.camel.beans;

/**
 * Created with IntelliJ IDEA.
 * User: Ivan
 * Date: 5/28/13
 * Time: 1:43 PM
 * To change this template use File | Settings | File Templates.
 */
public enum JMeterThread {

    STANDARD_JMETER_ENGINE("StandardJMeterEngine", false),
    GUI_THREAD_WINDOWS("AWT-Windows", true),
    GUI_THREAD_MACOSX("AWT-AppKit", true),
    GUI_THREAD_LINUX("AWT-XAWT", true);

    private final String threadName;
    private final boolean isGUIThread;

    JMeterThread(String threadName, boolean isGUIThread) {
        this.threadName = threadName;
        this.isGUIThread = isGUIThread;
    }

    public String getThreadName() {
        return threadName;
    }

    public boolean isGUIThread() {
        return isGUIThread;
    }
}
