package com.example.task03;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre) {
        int decimetrs = centimetre / 100;
        return decimetrs;
    }

    public static void main(String[] args) {
        int result = getMetreFromCentimetre(4721);
        System.out.println(result);
    }

}
