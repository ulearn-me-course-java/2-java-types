package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        return getTypeOfNumber(input);
    }

    public static void main(String[] args) {
    }

    public static String getTypeOfNumber(String value){
        long currentValue = Long.parseLong(value);
        if(currentValue <= Byte.MAX_VALUE && currentValue >= Byte.MIN_VALUE)
            return "byte";
        if (currentValue <= Short.MAX_VALUE && currentValue >= Short.MIN_VALUE)
            return "short";
        if (currentValue <= Integer.MAX_VALUE && currentValue >= Integer.MIN_VALUE)
            return "int";
        else
            return "long";
    }

}
