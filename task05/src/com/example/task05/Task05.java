package com.example.task05;

public class Task05 {

    public static String solution(int x) {

    String num = String.valueOf(x);
    for (int i = 0; i < num.length(); i++){
        char symb = num.charAt(i);
        if (symb % 2 == 0) continue;
        else return "FALSE";
    }
    return "TRUE";
    }

    public static void main(String[] args) {

        String result = solution(44282);
        System.out.println(result);

    }

}
