package com.example.task03;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        int result = 0;
        result = centimetre / 100;
        return result;
    }

    public static void main(String[] args) {
        int result = getMetreFromCentimetre(345);
        System.out.println(result);
    }
}
