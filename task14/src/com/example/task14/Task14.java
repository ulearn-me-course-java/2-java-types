package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        // TODO напишите здесь код, переставляющий цифры числа в обратном порядке
        String tmp = Integer.toString(value);
        String res = new StringBuilder(tmp).reverse().toString();
        return Integer.parseInt(res);
    }

    public static void main(String[] args) {

    }


}
