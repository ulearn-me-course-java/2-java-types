package com.example.task03;
import java.math.*;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre) {
        double metre = centimetre * 0.01;
        return (int)metre;
    }

    public static void main(String[] args) {

        int result = getMetreFromCentimetre(465);
        System.out.println(result);
    }

}
