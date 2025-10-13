package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        String numberString = String.valueOf(value);
        String reversedString = new StringBuilder(numberString).reverse().toString();
        int number = Integer.valueOf(reversedString);
        return number;
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);

    }


}
