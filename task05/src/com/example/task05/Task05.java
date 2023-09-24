package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        String xStr = Integer.toString(x);
        for (char i : xStr.toCharArray()) {
            if ((Integer.parseInt(String.valueOf(i))) % 2 == 1) return "FALSE";
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }

}
