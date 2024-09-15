package com.example.task03;
import java.lang.Math;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        return (int) Math.floor(centimetre/100);
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = getMetreFromCentimetre(345);
        System.out.println(result);
         */
    }

}
