package com.example.task02;

public class Task02 {

    public static String solution(String input)
    {
        long inputNum = Long.parseLong(input);

        if (inputNum > Integer.MAX_VALUE || inputNum < Integer.MIN_VALUE)
        {
            return "long";
        }
        if (inputNum > Short.MAX_VALUE || inputNum < Short.MIN_VALUE)
        {
            return "int";
        }
        if (inputNum > Byte.MAX_VALUE || inputNum < Byte.MIN_VALUE)
        {
            return "short";
        }

        return "byte";
    }

    public static void main(String[] args) {

        //String result = solution("12345");
        //System.out.println(result);

    }

}
