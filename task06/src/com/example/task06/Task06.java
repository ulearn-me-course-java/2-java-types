package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int sum = x + y;
        String z = Integer.toString(sum);
        char[] arr = z.toCharArray();
        int len = arr.length;
        return len;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(12, 343);
        System.out.println(result);

    }

}
