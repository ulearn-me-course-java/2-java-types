package com.example.task02;

public class Task02
{
    public static String solution(String input)
    {
        try
        {
            int a = Integer.parseInt(input);
        }
        catch (RuntimeException e)
        {
            return "long";
        }
        try
        {
            short a = Short.parseShort(input);
        }
        catch (RuntimeException e)
        {
            return "int";
        }
        try
        {
            Byte a = Byte.parseByte(input);
        }
        catch (RuntimeException e)
        {
            return "short";
        }
        return "byte";
    }

    public static void main(String[] args) {

        String result = solution("12345");
        System.out.println(result);
    }

}
