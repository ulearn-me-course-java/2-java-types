package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        // TODO напишите здесь код, переставляющий цифры числа в обратном порядке
        String digit = Integer.toString(value);
        StringBuilder reverseDigitS = new StringBuilder(digit).reverse();
        String reverseDigit = String.valueOf(reverseDigitS);
        return Integer.parseInt(reverseDigit);
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int result = reverse(345);
        System.out.println(result);
    }


}
