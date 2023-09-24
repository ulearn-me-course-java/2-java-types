package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        // TODO напишите здесь код, переставляющий цифры числа в обратном порядке
        String strInt = String.valueOf(value);
        String revnum = new StringBuilder(strInt).reverse().toString();

        return Integer.parseInt(revnum);
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);

    }


}
