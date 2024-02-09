package com.example.task06;

import java.sql.SQLOutput;

public class Task06 {

    public static int solution(int x, int y) {
        int digitsCount = 0;
        int sumOfNumbers = x + y;

        if (sumOfNumbers == 0){
            return  1;
        }

        while (sumOfNumbers != 0){
            digitsCount += 1;
            sumOfNumbers /= 10;
        }

        return digitsCount;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(12, 34);
        System.out.println(result);
        */
    }

}
