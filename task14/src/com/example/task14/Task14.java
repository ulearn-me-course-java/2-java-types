package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        String strValue = Integer.toString((value));
        String strReversed = new StringBuilder(strValue).reverse().toString();
        return Integer.parseInt(strReversed);
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int result = reverse(345);
        System.out.println(result);
    }


}
