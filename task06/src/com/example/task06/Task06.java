package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int z = x + y;
        int count = 0;

        if(z == 0)
            count = 1;
        else count = 0;

        while (z != 0) {
            count++;
            z = z / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int result = solution(1, 567);
        System.out.println(result);
    }

}
