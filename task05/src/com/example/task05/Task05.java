package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        String input = String.valueOf(x);

        for (int i = 0; i < input.length(); i++) {
            if ((byte) input.charAt(i) % 2 != 0)
                return "FALSE";
        }

        return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution(22445);
        System.out.println(result);

    }

}
