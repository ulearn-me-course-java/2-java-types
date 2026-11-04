package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        String valueAsString = String.valueOf(value);

        String reverseString = new StringBuilder(valueAsString).reverse().toString();

        return Integer.parseInt(reverseString);
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);
    }


}
