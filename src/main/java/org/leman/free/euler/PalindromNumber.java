package org.leman.free.euler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PalindromNumber {
    public static boolean isPalindrome(String s) {
        final String rev = new StringBuilder(s).reverse().toString();
        if( s.equals( rev ) ) return true;
        return false;
    }

    public static void main(String[] args) {
        List<Integer> palindroms = new ArrayList<>();
        for(int i = 999; i> 99; i--) {
            for(int j = 999; j> 99; j--) {
                Integer number = i * j;
                if (isPalindrome(String.valueOf(number))) {
                    palindroms.add(number);
                }
            }
        }

        Collections.sort(palindroms);
        System.out.println(palindroms.get(palindroms.size()-1));
    }
}
