package org.leman.free.euler;

public class DifferenceOfSquares {
    public static final int ONE_HUNDRED = 100;
    public static final Integer sumOfFirstOneHundred = (ONE_HUNDRED) * (ONE_HUNDRED + 1 ) / 2;

    public static void main(String[] args) {
        Long sum = 0l;
        for (int i= 1; i<= ONE_HUNDRED; i++) {
            sum = sum + (i * i);
        }
        System.out.println((sumOfFirstOneHundred * sumOfFirstOneHundred) - sum);
    }
}
