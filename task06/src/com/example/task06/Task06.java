package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum = x + y;
        String sumStr = String.valueOf(sum);
        int startIndex = 0;
        if (sumStr.charAt(0) == '-') {
            startIndex = 1;
        }
        int counter = 0;
        for (int i = startIndex; i < sumStr.length(); i++) {
            counter++;
        }

        return counter;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(12, 34);
        System.out.println(result);
        */
    }

}
