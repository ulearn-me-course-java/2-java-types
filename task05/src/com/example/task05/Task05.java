package com.example.task05;

public class Task05 {
    public static String solution(int x) {
        char[] array = String.valueOf(x).toCharArray();
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 != 0)
                return "FALSE";
        return "TRUE";
    }

    public static void main(String[] args) {
        System.out.println(solution(42680));
    }
}