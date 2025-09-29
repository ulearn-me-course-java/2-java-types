package com.example.task03;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre) {

        int meter = centimetre / 100 ;

        return meter;
    }

    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(580));
    }

}
