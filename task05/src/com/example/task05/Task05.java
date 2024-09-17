package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        String num = String.valueOf(x);

        for (int i = 0; i < num.length(); i++) {

            int ch = Character.getNumericValue(num.charAt(i));
            if (ch % 2 == 1) return "FALSE";
        }

        return "TRUE";
    }

    public static void main(String[] args) {
        String result = solution(6204);
        System.out.println(result);
    }

}
