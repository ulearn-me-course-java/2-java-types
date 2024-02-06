package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        boolean flag = true;

        while (x > 0) {
            if (x % 2 != 0){
                flag = false;
                x /= 10;
            } else {
                x /= 10;
            }
        }

        if (flag == true) {
            return "TRUE";
        }
        else {
        return "FALSE"; }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution(1234);
        System.out.println(result);
        */
    }

}
