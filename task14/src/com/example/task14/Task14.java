package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        String strNum = String.valueOf(value);
        String reversed = new StringBuilder(strNum).reverse().toString();

        return Integer.parseInt(reversed);
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
    }


}
