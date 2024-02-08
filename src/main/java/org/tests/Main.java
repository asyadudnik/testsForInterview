package org.tests;

import static org.tests.fibonacci.PrintFibonacci.printFibonacciSequence;
import static org.tests.fibonacci.PrintFibonacciRecursive.printFibonacciWithRecurse;
import static org.tests.odd.OddNumbers.printOddResults;
import static org.tests.prime.PrimeNumberCheck.isPrime;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //prime
        System.out.println(isPrime(19)); // true
        System.out.println(isPrime(49)); // false
        //fibonacci
        printFibonacciSequence(10);

        printFibonacciWithRecurse();
        //odd

        printOddResults();

    }
}