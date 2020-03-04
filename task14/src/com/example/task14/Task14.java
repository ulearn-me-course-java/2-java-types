package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        String result = new StringBuilder(Integer.toString(value)).reverse().toString();
        return Integer.parseInt(result);
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
