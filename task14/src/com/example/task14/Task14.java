package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        int num = value;
        return num = Integer.parseInt(new StringBuffer(String.valueOf(num)).reverse().toString());
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);

    }


}
