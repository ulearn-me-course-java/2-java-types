package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        String number = Integer.toString(x);
        for (char digit: number.toCharArray()) {
            if (Integer.parseInt(Character.toString(digit)) % 2 != 0) {
                return "FALSE";
            }
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution(1234);
        System.out.println(result);
        */
    }

}
