package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        boolean flag = true;
        while (flag){
            if ((x%10) % 2 != 0) flag = false;
            if (x == 0) break;
            x /= 10;
        }
        if (flag) return "TRUE";
        else return "FALSE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution(280264);
        System.out.println(result);

    }

}
