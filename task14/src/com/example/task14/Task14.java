package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        // TODO напишите здесь код, переставляющий цифры числа в обратном порядке
        String str = Integer.toString(value);
        String rev = new StringBuilder(str).reverse().toString();
        return Integer.parseInt(rev);
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);

    }


}
