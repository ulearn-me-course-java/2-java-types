package com.example.task02;

public class Task02 {
    static int intMax = Integer.MAX_VALUE;
    static int intMin = Integer.MIN_VALUE;

    static byte byteMax = Byte.MAX_VALUE;
    static byte byteMin = Byte.MIN_VALUE;

    static short shortMax = Short.MAX_VALUE;
    static short shortMin = Short.MIN_VALUE;

    static long longMax = Long.MAX_VALUE;
    static long longMin = Long.MIN_VALUE;

    public static String solution(String input) {
        long longInput = Long.parseLong(input);
        if ((longInput <= byteMax) && (longInput >= byteMin)) { return "byte";}
        else if ((longInput <= shortMax) && (longInput >= shortMin)) { return "short";}
        else if ((longInput <= intMax) && (longInput >= intMin)) { return "int";}
        else if ((longInput <= longMax) && (longInput >= longMin)) { return "long";}
        else {return "error";}
    }

    public static void main(String[] args) {

    }

}
