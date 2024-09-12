package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        String stringNum = Integer.toString(x + y);

        if(stringNum.contains("-"))
            return stringNum.length() - 1;
        else
            return stringNum.length();
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
