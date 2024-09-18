package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int sumNumbers = x + y;
        int count = 0;
        while(sumNumbers != 0){
            count += 1;
            sumNumbers /= 10;
        }

        if (count == 0) return 1;
        return count;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(12, 34);
        System.out.println(result);

    }

}
