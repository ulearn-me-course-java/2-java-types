package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        try {
            byte num = Byte.parseByte(input);
            return "Byte";
        }
        catch (Exception ex)
        {
        }
        try {
            short num = Short.parseShort(input);
            return "Short";
        }
        catch (Exception ex)
        {
        }
        try {
            int num = Integer.parseInt(input);
            return "Integer";
        }
        catch (Exception ex)
        {
        }
        try {
            long num = Long.parseLong(input);
            return "Long";
        }
        catch (Exception ex)
        {
        }
        return "Long";
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }
}
