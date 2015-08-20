package org.leman.free.euler;

import static org.leman.free.euler.CommonMethods.isPrime;

public class PrimeNumbers {

    public static void main(String[] args) {
        Boolean x = true;
        Integer primePosition = 1;
        Integer start = 2;
        do {
            start++;
            if (isPrime(start)) {
                 primePosition++;
             }

            if (primePosition == 10001) {
                    x = false;
                    continue;
                }
            //System.out.println(start + "---------------------------  " + primePosition);
        } while (x);

        System.out.println("The prime number at position " + primePosition + " is " + start++);

    }

    //
}
