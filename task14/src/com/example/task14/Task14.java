package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        Integer valueInWrapper = value;
        String stringResult = new StringBuilder(valueInWrapper.toString()).reverse().toString();
        return Integer.valueOf(stringResult);
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
    }


}
