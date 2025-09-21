package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        String xStr = String.valueOf(x);

        for (int i = 0; i < xStr.length(); i++){
            int num = Character.getNumericValue(xStr.charAt(i));
            if (num % 2 != 0) return "FALSE";
            else i++;
        }

        return "TRUE";
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }
}
