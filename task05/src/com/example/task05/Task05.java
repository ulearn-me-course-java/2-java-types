package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        boolean f = true;
        while (x > 0) {
            if ((x % 10) % 2 == 1) {
                f = false;
                break;
            }
            x /= 10;
        }
        if (f)
            return "TRUE";
        else
            return "FALSE";

    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
/*
        String result = solution(2480900);
        System.out.println(result);
*/
    }

}
