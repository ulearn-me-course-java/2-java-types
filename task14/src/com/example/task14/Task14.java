package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        String res = new StringBuilder(Integer.toString(value)).reverse().toString();
        int rvrs = Integer.parseInt(res);
        return rvrs;
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);

    }


}
