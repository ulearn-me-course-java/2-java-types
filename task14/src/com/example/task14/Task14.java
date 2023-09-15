package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        String num = String.valueOf(value);
        String correect = new StringBuilder(num).reverse().toString();
        int num1 = Integer.parseInt(correect);
        return num1;
    }

    public static void main(String[] args) {

        int result = reverse(1345);
        System.out.println(result);

    }


}
