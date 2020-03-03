package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        // TODO напишите здесь код, переставляющий цифры числа в обратном порядке
        String num = new StringBuilder(Integer.toString(value)).reverse().toString(); //преобразование числа в строку
        return Integer.parseInt(num); //преобразование строки в число
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = reverse(345);
        System.out.println(result);

    }


}
