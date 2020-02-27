package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        String num = Integer.toString(x);
        if(num.contains("1") || num.contains("3") || num.contains("5") || num.contains("7") || num.contains("9"))
            return "FALSE";
        else return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution(28);
        System.out.println(result);
    }

}
