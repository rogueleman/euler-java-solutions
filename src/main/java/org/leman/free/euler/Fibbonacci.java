package org.leman.free.euler;

import java.util.ArrayList;
import java.util.List;

public class Fibbonacci {
    final static List<Integer> fibb = new ArrayList<>();

    public static void main(String[] args) {
        fibb.add(1);
        fibb.add(2);

        Integer sum = 2;
        Integer integer = 0;
        Integer toAdd;

        do {
            toAdd = fibb.get(integer) + fibb.get(++integer);
            fibb.add(toAdd);
            if (toAdd % 2 == 0) {
                sum = sum + toAdd;
            }

        } while (toAdd < 4000000);
        System.out.println(fibb);
        System.out.println(sum);

    }

}
