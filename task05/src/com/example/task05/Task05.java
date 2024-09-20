package com.example.task05;

public class Task05 {

    public static String solution(int x)
    {
        String stringNum = Integer.toString(x);

        for (int i = 0; i<stringNum.length(); i++)
        {
            int ch = Character.getNumericValue(stringNum.charAt(i));

            if (ch % 2 == 1) return "FALSE";
        }

        return "TRUE";
    }

    public static void main(String[] args)
    {
        String result = solution(2240);
        System.out.println(result);
    }

}
