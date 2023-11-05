package com.example.task01;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;


public class Task01 {

    public static String solution() {
        return "Я думаю, быть программистом - это круто";
    }

    public static void main(String[] args) {
        String result = solution();
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}