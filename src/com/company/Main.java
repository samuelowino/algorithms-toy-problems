package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(funca(1200));
    }

    public static int funca(int N) {
        if (N < 10) return 0;
        else {
            int length = String.valueOf(N).length();
            char firstVal = String.valueOf(N).charAt(0);
            System.out.println(firstVal);
            String value = String.valueOf(1).concat(zeros(length));

            return Integer.valueOf(value);
        }
    }

    public static String zeros(int length) {
        String zeroValue = "";
        for (int i = 0; i < length - 1; i++) {
            zeroValue = zeroValue.concat("0");
        }

        return zeroValue;
    }

    public static int getDecimal(int binary){
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }
}
