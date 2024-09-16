package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        boolean isEven = false;
        while (x > 0){
            if ((x % 10) % 2 == 0){
                isEven = true;
            }
            else {
                isEven = false;
                break;
            }
            x /= 10;
        }
        if (isEven) return "TRUE";
        return "FALSE";

    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution(6666);
        System.out.println(result);
    }

}
