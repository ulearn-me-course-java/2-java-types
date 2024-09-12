package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long value = Long.parseLong(input);
        String output = null;
        if (value > 0){
            if (value <= 127){
                output = "byte";
            }
            if (value > 127 && value <= 32767){
                output = "short";
            }
            if (value > 32767 && value <= 2147483647){
                output = "int";
            }
            if (value > 2147483647){
                output = "long";
            }
        } else {
            if (value >= -128){
                output = "byte";
            }
            if (value < -128 && value >= -32768){
                output = "short";
            }
            if (value < -32768 && value >= -2147483648){
                output = "int";
            }
            if (value < -2147483648){
                output = "long";
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
