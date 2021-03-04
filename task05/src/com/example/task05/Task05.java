package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        String result = String.valueOf(x);
        char[] sym = new char[5];
        sym[0] = '1';
        sym[1] = '3';
        sym[2] = '5';
        sym[3] = '7';
        sym[4] = '9';

        for (byte count = 0; count < 5; count++) {
            if (result.indexOf(sym[count]) != -1) {
                return "FALSE";
            }
        }

        return "TRUE";
    }

    public static void main(String[] args) {

    }

}
