package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        String str = Integer.toString(value);
        str = new StringBuilder(str).reverse().toString();
        int valueReverse = Integer.parseInt(str);

        return valueReverse;
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);

    }


}
