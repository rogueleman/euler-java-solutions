package org.leman.free.euler;

public class CommonMethods {

    static int temp;

    /**
     * If the number is prime return true  else not
     *
     * @param num
     * @return
     */
    public static boolean isPrime(Integer num) {
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }
}
