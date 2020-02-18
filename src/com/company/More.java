package com.company;

import java.math.BigDecimal;

public class More {

    public static void main(String[] args) {
        String steps = funca("00010101110");
        System.out.println("setps " + steps);
    }

    public static String funca(String S) {

        int steps = 0;
        long N = 0;

        try {
            N = getDecimal(Integer.valueOf(S));
        } catch (NumberFormatException ex) {
            N = toDecimal(S).intValue();
        }

        do {
            if (N < 0) return "0";

            if (N % 2 == 0) N = N / 2;
            else
                N = N - 1;
            steps++;
        } while (N != 0);

        return String.valueOf(steps);
    }

    public static int getDecimal(int binary) {
        int decimal = 0;
        int n = 0;
        while (true) {
            if (binary == 0) {
                break;
            } else {
                int temp = binary % 10;
                decimal += temp * Math.pow(2, n);
                binary = binary / 10;
                n++;
            }
        }
        return decimal;
    }

    public static BigDecimal toDecimal(String b) {
        BigDecimal bd1 = new BigDecimal(b.charAt(0)=='1'?1:0);
        BigDecimal two = new BigDecimal(2);
        for (int i = 1; i<b.length(); i++) {
            bd1 = bd1.multiply(two);
            bd1 = bd1.add(new BigDecimal(b.charAt(i)=='1'?1:0));
        }
        return bd1;
    }
}
