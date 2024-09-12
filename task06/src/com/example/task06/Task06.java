package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        int a = x + y;
        int i = 0;
        if (x + y == 0)
            return 1;
        else
            while (Math.abs(a) > 0) {
                a /= 10;
                i++;
            }
        return i;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int result = solution(12000, 34454564);
        System.out.println(result);
    }

}
