package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int c = x + y;
        if (c >= 0){
            String s = String.valueOf((int) c);
            return s.length();
        }
        else {
            String s = String.valueOf(c);
            return (s.length()-1);
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(-111, -222);
        System.out.println(result);

    }

}
