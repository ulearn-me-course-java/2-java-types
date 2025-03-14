package com.example.task05;

public class Task05 {

    public static String solution(int x) {


        while (x > 0) {
            int digit = x % 10; // Получаем последнюю цифру
            if (digit % 2 != 0) { // Проверяем, чётная ли она
                return "FALSE"; // Если цифра нечётная, возвращаем false
            }
            x /= 10; // Убираем последнюю цифру из числа
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
