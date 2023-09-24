package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        if (value < 0) {
            return -1;
        }
        String valueStr = Integer.toString(value);
        String reversedStr = new StringBuilder(valueStr).reverse().toString();

        try {
            return Integer.parseInt(reversedStr);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        int result = reverse(5432);
        System.out.println(result);
    }


}
