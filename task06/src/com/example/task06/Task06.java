package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        x = x + y;
        int i = 1;
        if(x == 0)
        {
            return i;
        }

        if(x > 0) {
            while (x >= 0) {
                if (x == 0){
                    return i - 1;
                }
                int z = x % 10; //Получаем последнее число
                i++;
                x = x / 10; //Иначе затираем и идём дальше
            }
        }
        else {
            while (x <= 0) {
                if (x == 0) {
                    return i - 1;
                }
                int z = x % 10; //Получаем последнее число
                i++;
                x = x / 10; //Иначе затираем и идём дальше
            }
        }
        return i;
    }


    public static void main(String[] args) {

        int result = solution(1, 1);
        System.out.println(result);

    }

}
