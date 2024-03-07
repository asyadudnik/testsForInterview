package org.tests;

import org.tests.threads.CustomThread;

import static org.tests.fibonacci.PrintFibonacci.printFibonacciSequence;
import static org.tests.fibonacci.PrintFibonacciRecursive.printFibonacciWithRecurse;
import static org.tests.functional_interface.CallFunctionalInterface.call;
import static org.tests.odd.OddNumbers.printOddResults;
import static org.tests.prime.PrimeNumberCheck.isPrime;
import static org.tests.modules.streams.JobStream.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //prime
        System.out.println(isPrime(19)); // true
        System.out.println(isPrime(49)); // false
        //fibonacci
        System.out.println("====== fibonacci==============");
        printFibonacciSequence(10);
        printFibonacciWithRecurse();
        //odd
        System.out.println("====== odd==============");
        printOddResults();

        System.out.println("====== threads==============");

        CustomThread t1 = new CustomThread("Первый поток");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            t1.interrupted();
            throw new RuntimeException(e);
        }
        CustomThread t2 = new CustomThread("Второй поток");
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            Thread.interrupted();
            throw new RuntimeException(e);
        }
        CustomThread t3 = new CustomThread("Третий поток");
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            Thread.interrupted();
            throw new RuntimeException(e);
        }
        //streams
        System.out.println("======Streams======================");
        reduceUsage();
        min();
        primitivesAverage();
        filters();
        flatMap();
        test();
        dublicates();
        System.out.println("======");
        call(14,23);
        call(21,123);
        testStream();
        testGroupping();
        testSmallestLargestDigit();
    }
}