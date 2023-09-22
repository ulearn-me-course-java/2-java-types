package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        String valueString = Integer.toString(value);
        String revers = new StringBuilder(valueString).reverse().toString();
        return Integer.parseInt(revers);
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
    }


}
