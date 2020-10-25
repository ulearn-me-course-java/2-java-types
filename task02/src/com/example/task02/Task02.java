package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long convertInput = Long.parseLong(input);
        if(convertInput == (byte)convertInput) return "byte";
        if(convertInput == (short)convertInput) return "short";
        if(convertInput == (int)convertInput) return "int";
        return "long";
    }


    public static void main(String[] args) {

    }

}