package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        while (x != 0)
        {
            if ((x % 10) % 2 != 0)
                return "FALSE";
            x /= 10;
        }
        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution(2224);
        System.out.println(result);

    }

}
