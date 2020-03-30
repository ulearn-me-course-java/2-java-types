package com.example.task03;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre) {

        int metre = centimetre/100;
        return metre;

    }

    public static void main(String[] args) {

        int result = getMetreFromCentimetre(34);
        System.out.println(result);

    }

}
