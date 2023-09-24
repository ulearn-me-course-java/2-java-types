package com.example.task13;

public class Task13 {

    public static char toUpperCase(char c) {

        // TODO привести букву к верхнему регистру
        //char[] symbol = Character.toChars(Character.getNumericValue(c) - 32);
        //return symbol[0];
        return Character.toUpperCase(c);
    }

    public static void main(String[] args) {

        char result = toUpperCase('x');
        System.out.println(result);

    }

}
