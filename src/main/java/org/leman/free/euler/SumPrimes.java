package org.leman.free.euler;

import static org.leman.free.euler.CommonMethods.isPrime;

public class SumPrimes {
    public static void main(String[] args) {
        Long sum = 0L;
        for (int i=2 ; i<2000000; i++) {
            if(isPrime(i)) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

}
