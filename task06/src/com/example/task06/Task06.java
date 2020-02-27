package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        String str = Integer.toString(x + y);
        if(!str.contains("-"))
            return str.length();
        else return str.length() - 1;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(120, 34);
        System.out.println(result);
    }

}
