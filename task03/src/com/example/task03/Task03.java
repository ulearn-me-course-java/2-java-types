package com.example.task03;

public class Task03 {

    public static int getMetreFromCentimetre(double centimetre) {

        int metres = (int) Math.floor(centimetre);

        return metres;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        double result = getMetreFromCentimetre(345.7);
        System.out.println(result);

    }

}
