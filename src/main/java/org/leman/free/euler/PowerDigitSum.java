package org.leman.free.euler;

import static org.apache.commons.lang.StringUtils.isEmpty;

import java.math.BigInteger;

public class PowerDigitSum {
    public static void main(String[] args) {

        System.out.println(sum(new BigInteger("1").shiftLeft(1000).toString()));
    }

    public static Long sum(String substring) {
        Long sum = 0L;
        final String[] split = substring.split("");
        for (String s : split) {
            if (!isEmpty(s)) {
                sum = sum + Long.valueOf(s);
            }
        }
        return sum;
    }

}