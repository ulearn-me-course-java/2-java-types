package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        Integer v = value;
        String input = v.toString();
        StringBuilder reverse = new StringBuilder(input).reverse();
        int result = Integer.parseInt(reverse.toString());

        return result;
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);
    }


}
