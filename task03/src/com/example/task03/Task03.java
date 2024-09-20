package com.example.task03;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre)
    {
        int metrs = 0;
        metrs = centimetre/100;
        return metrs;
    }

    public static void main(String[] args)
    {
        int result = getMetreFromCentimetre(500);
        System.out.println(result);
    }

}
