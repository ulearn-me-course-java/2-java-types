package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        String numberStr = String.valueOf(x);

        for (char digit : numberStr.toCharArray()) {
            if (Integer.parseInt(Character.toString(digit)) % 2 != 0) {
                return "FALSE";
            }
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        String result = solution(2468);
        System.out.println(result);
    }

}
