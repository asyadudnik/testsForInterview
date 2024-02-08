package org.tests.fibonacci;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintFibonacci {
    private static final Logger logger = Logger.getLogger(PrintFibonacci.class.getName());
    private PrintFibonacci() {
    }

    public static void printFibonacciSequence(int count) {
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 1; i <= count; i++) {
            System.out.print(a + ", ");
            if(logger.isLoggable(Level.ALL)) {
                logger.info(a + ", ");
            }
            a = b;
            b = c;
            c = a + b;
        }
    }


}
