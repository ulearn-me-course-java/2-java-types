package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        String strValue = Integer.toString(value);
        String strResult = new StringBuilder(strValue).reverse().toString();
        int result = Integer.parseInt(strResult);
        return result;
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);

    }


}
