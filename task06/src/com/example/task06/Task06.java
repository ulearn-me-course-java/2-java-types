package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int result = x+y;
        String strResult = Integer.toString(result);
        int count = 0;
        if (result < 0) count = -1;

        for (int i = 0; i < strResult.length(); i++){
            count++;
        }

        return count;
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
