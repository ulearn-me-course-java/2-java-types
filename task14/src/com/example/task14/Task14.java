package com.example.task14;

public class Task14 {

    public static int reverse(int value) {
        String strValue = Integer.toString(value);
        String reversedStrValue = new StringBuilder(strValue).reverse().toString();
        return Integer.parseInt(reversedStrValue);
    }

    public static void main(String[] args) {
    }

}
