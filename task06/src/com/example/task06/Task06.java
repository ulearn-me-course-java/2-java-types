package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int z = x + y;
        int len = String.valueOf(z).length();
        if(String.valueOf(z).contains("-")){
            len--;
        }
        return len;
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
