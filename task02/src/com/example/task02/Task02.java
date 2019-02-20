package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        String output = "Input error.";
        try {
            Long.parseLong(input);//64 bit
            output = "long";
            Integer.parseInt(input);//32 bit
            output = "int";
            Short.parseShort(input);//16 bit
            output = "short";
            Byte.parseByte(input);//8 bit
            return "byte";
        } catch (Exception e) {
            return output;
        }
    }

    public static void main(String[] args) {
        /*String result = solution("12345");
        System.out.println(result);*/
    }

}
