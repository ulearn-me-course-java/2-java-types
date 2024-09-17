package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        if (x < 0 || x > 99999) {
            System.out.println("Число Х не входит в указанный диапазон");
            System.exit(1);
        }
        String numberString = Integer.toString(x);

        for (char digit : numberString.toCharArray()) {
            if (Character.getNumericValue(digit) % 2 != 0) {
                return "FALSE";
            }
        }
        return "TRUE";

    }

    public static void main(String[] args) {
        String result = solution(93999);
        System.out.println(result);

    }

}
