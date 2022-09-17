package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        int evenNumb = 0;
        int i = 0;
        while (x != 0) {
            if ((x % 10) % 2 == 0) {
                evenNumb++;
            }
            x /= 10;
            i++;
        }
        if (evenNumb == i) {
            return "TRUE";
        } else {
            return "FALSE";
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution(1234);
        System.out.println(result);

    }

}
