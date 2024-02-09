package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        if (value == 0){
            return 0;
        }

        int result = 0;

        while (value != 0) {
            result *= 10;
            result += value % 10;
            value /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = reverse(345);
        System.out.println(result);
         */
    }


}
