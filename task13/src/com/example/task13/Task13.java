package com.example.task13;

public class Task13 {

    public static char toUpperCase(char c) {
        int i = 'A' + (c - 'a');
        c = (char)i;
        // TODO привести букву к верхнему регистру

        return c;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        char result = toUpperCase('x');
        System.out.println(result);

    }

}
