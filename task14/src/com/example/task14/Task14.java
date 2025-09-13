package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        String strValue = String.valueOf(value);
        String reversed = new StringBuilder(strValue).reverse().toString();
        int reversedNum = Integer.parseInt(reversed);

        return reversedNum;
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);
    }


}
