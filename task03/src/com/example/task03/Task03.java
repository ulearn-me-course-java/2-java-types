package com.example.task03;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre) {

       int count= (int)( centimetre/100);

        return count;
    }

    public static void main(String[] args) {

        int result = getMetreFromCentimetre(345);
        System.out.println(result);

    }

}
