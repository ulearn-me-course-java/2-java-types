package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        String temp = String.valueOf(value);
        String something = new StringBuilder(temp).reverse().toString();
        return Integer.parseInt(something);
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
    }


}
