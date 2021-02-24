package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int result = x + y;
        if (result == 0)
            return 1;

        int length = 0;
        while (result != 0){
            result /= 10;
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат

        int result = solution(12, 34);
        System.out.println(result);

    }

}
