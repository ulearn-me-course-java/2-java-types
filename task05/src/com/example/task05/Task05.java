package com.example.task05;

public class Task05 {

    static String solution(int x) {
        String strX = String.valueOf(x);
        boolean t = true;
        for (int i = 0; i < strX.length(); i++) {
            if ((strX.toCharArray()[i] % 2) == 1) {
                t = false;
                break;
            }
        }
        if (t)
            return "TRUE";
        else return "FALSE";
    }

    public static void main(String[] args) {
        String result = solution(88889);
        System.out.println(result);
    }

}
