package com.example.task13;

public class Task13 {

    public static char toUpperCase(char c) {

        char C =(char)(c-32);

        return C;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        char result = toUpperCase('x');
        System.out.println(result);

    }

}
