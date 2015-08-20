package org.leman.free.euler;

public class PrimeFactor {
    public static void main(String[] args) {
        Long number = 600851475143l;

        for (long i = 2 ; i <=number; i++) {
            if (number % i == 0) {
                System.out.println(i);
                number = number /i;
                i--;
            }
        }

    }
}
