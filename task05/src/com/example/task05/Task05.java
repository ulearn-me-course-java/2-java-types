package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        do {
            if(x%2!=0) return "FALSE";
            x/=10;

        }while (x/10!=0);
        if(x%2!=0) return "FALSE";
        return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution(10);
        System.out.println(result);

    }

}
