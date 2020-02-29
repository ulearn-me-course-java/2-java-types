package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        while(x >= 0)
        {
            if (x == 0)
                return "TRUE";
            int y = x % 10; //Получаем последнее число
            if (y % 2 != 0) //Проверяем число на чётность
               return "FALSE"; //Посылаем нахуй если ловим нечётное
            x = x / 10; //Иначе затираем и идём дальше
        }
        return "TRUE";
    }

    public static void main(String[] args) {

        String result = solution(7222);
        System.out.println(result);

    }

}
