package com.example.task03;

public class Task03 {

    public static double getMetreFromCentimetre(double centimetre) {
        return centimetre / 100;
    }

    public static void main(String[] args) {
        double result = getMetreFromCentimetre(345);
        System.out.println(result);
    }
}