package com.example.task03;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre) { return centimetre/100; }

    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(350));
        System.out.println(getMetreFromCentimetre(1532548433));
        System.out.println(getMetreFromCentimetre(35));
    }

}
