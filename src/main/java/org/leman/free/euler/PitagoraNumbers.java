package org.leman.free.euler;

public class PitagoraNumbers {

    public static final Integer LIMIT = 1000;

    public static void main(String[] args) {
        for (int i = 1; i<LIMIT; i++ ) {
            for (int j = 1; j <LIMIT; j++) {
                final double sqrt = Math.sqrt(i * i + j * j);
                if ((sqrt % 1 )== 0) {
                    if (i+j+(int)sqrt == LIMIT) {
                        System.out.println(i + " " + j + " " + sqrt);
                        System.out.println("Produsul lor este " + (i * j * (int)sqrt));
                    }
                }
            }
        }
    }
}
