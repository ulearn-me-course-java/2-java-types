package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        char[] chars = String.valueOf(x).toCharArray();
		
        for (int i = 0; i < chars.length; i++)
            if ((chars[i] % 2) > 0)
                return "FALSE";
		
        return "TRUE";
    }

    public static void main(String[] args) {
		
    }

}
