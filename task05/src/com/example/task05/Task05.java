package com.example.task05;
public class Task05 {

    public static String solution(int x) {
        String strX = Integer.toString(x);
        if (strX.contains("1") || strX.contains("3") || strX.contains("5") || strX.contains("7") || strX.contains("9"))
        {
            return "FALSE";
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }

}
