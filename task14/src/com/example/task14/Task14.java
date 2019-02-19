package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        String str = String.valueOf(value);
        str = new StringBuilder(str).reverse().toString();
        value = Integer.parseInt(str);
        return value;
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);
    }

}
