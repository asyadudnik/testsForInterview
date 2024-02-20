package org.tests.threads;

import static java.lang.Thread.interrupted;

public class CustomThread extends Thread {
    private final String threadName;

    public CustomThread(final String  threadName){
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(threadName + " - begin");
        try {

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            interrupted();
            e.printStackTrace();
        }

        System.out.println(threadName + " - finished");
    }
}
