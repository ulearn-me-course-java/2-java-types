package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        String line = String.valueOf(value);
        return Integer.parseInt(new StringBuilder(line).reverse().toString());
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);

    }


}
