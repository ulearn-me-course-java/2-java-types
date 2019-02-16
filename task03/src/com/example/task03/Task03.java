package com.example.task03;

public class Task03 {
    static int getMetreFromCentimetre(int centimetre) {
        return centimetre / 100;
    }

    public static void main(String[] args) {
        int result = getMetreFromCentimetre(73);
        System.out.println(result);
    }
}
