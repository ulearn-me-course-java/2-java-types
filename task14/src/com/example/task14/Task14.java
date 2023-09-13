package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        String strValue = Integer.toString(value);
        String temp = new StringBuilder(strValue).reverse().toString();
        return Integer.parseInt(temp);
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
    }


}
