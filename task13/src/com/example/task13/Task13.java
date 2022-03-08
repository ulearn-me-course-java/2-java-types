package com.example.task13;

public class Task13 {

    public static char toUpperCase(char c) {

        int code = (int) c;
        if (code > 64 && code < 91)
            return (char)(code + 32);
        else if (code > 96 && code < 123)
            return (char)(code - 32);
        return '\u0030';
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        char result = toUpperCase('a');
        System.out.println(result);

    }

}
