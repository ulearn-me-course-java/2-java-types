package com.example.task03;

import static java.lang.Math.*;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre) {

        double del = (double) centimetre / 100;
        int metres = (int) floor(del);
        return metres;

    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        double result = getMetreFromCentimetre(270);
        System.out.println(result);

    }

}
