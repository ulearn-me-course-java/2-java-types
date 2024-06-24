package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int counter = 0;
        int result = x + y;
        if (result == 0){
            return 1;
        }
        while(result != 0)
        {
            counter++;
            result /= 10;
        }
        return counter;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(12, 34);
        System.out.println(result);

    }

}
