package com.example.task05;

public class Task05 {

    public static String solution(int value) {
        int degree = (int) Math.pow(10, (int) Math.log10(value));
        while (degree != 0){
            if((value / degree) % 2 == 1) return "FALSE";
            value %= degree;
            degree /= 10;
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
