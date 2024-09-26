package com.example.task02;

import sun.text.IntHashtable;

public class Task02 {

    public static String solution(String input) {
        long inputLong;
        String result = "error";
        try {
            inputLong = Long.parseLong(input);
            result = "long";
        }
        catch (NumberFormatException e){
            return result;
        }
        if (inputLong == (byte) inputLong) result = "byte";
        else if (inputLong == (short) inputLong) result = "short";
        else if (inputLong == (int) inputLong) result = "int";
        return result;
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
