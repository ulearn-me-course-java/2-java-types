package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        int a;
        while (x > 0) {
            a = x % 10;
            if (a % 2 > 0)
                return "FALSE";
            x = x / 10;
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        String result = solution(4224);
        System.out.println(result);
    }

}
