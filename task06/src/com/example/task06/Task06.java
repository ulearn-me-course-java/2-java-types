package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        String res = Integer.toString(x + y);
        int result = res.length();
        if (x + y >= 0)
            return result;
        else
            return result - 1;
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
