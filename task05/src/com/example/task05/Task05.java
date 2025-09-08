package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        String str = String.valueOf(x);

        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            if (digit % 2 != 0) { // если цифра нечетная
                return "FALSE";
            }
        }

        return "TRUE";
    }

    public static void main(String[] args) {

        String result = solution(1234);
        System.out.println(result);

    }

}
