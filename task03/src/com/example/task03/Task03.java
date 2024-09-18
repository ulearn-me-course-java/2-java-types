package com.example.task03;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre) {
        if (centimetre > 0) {
            return centimetre / 100;
        }
        return 0;
    }

    public static void main(String[] args) {

        int result = getMetreFromCentimetre(345);
        System.out.println(result);

    }

}
