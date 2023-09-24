package com.example.task03;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre) {
        if (centimetre >=0) {
            return centimetre / 100;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int result = getMetreFromCentimetre(123456);
        System.out.println(result);
    }
}
