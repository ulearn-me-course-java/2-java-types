package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        String vvalue = Integer.toString(value);
        String str = new StringBuilder(vvalue).reverse().toString();
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);
    }


}
