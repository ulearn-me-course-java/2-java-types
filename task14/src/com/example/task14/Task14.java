package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        String number = Integer.toString(value);
        String reverse = new StringBuilder(number).reverse().toString();
        return Integer.parseInt(reverse);
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);

    }


}
