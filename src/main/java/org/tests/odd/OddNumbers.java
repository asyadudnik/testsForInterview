package org.tests.odd;

import java.util.ArrayList;
import java.util.List;

public class OddNumbers {
    private OddNumbers() {
    }

    public static boolean onlyOddNumbers(List<Integer> list) {
        for (int i : list) {
            if (i % 2 == 0)
                return false;
        }

        return true;
    }
    public static boolean onlyOddNumbers2(List<Integer> list) {
        return list
                .parallelStream() // parallel stream for faster processing
                .anyMatch(x -> x % 2 != 0); // return as soon as any elements match the condition
    }
    public static void printOddResults(){
        List<Integer> intNumbers=new ArrayList<>();
        intNumbers.add(1);
        intNumbers.add(2);
        intNumbers.add(3);
        intNumbers.add(4);
        intNumbers.add(15);
        intNumbers.add(16);
        System.out.println(onlyOddNumbers(intNumbers));
        System.out.println(onlyOddNumbers2(intNumbers));

    }
}
