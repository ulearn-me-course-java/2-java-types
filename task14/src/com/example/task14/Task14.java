package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        String s = new StringBuilder(Integer.toString(value)).reverse().toString();
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        int result = reverse(123456789);
        System.out.println(result);
    }


}
