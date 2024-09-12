package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        String str = Integer.toString(value);
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        str = builder.toString();
        return Integer.parseInt(str);

    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
    }


}
