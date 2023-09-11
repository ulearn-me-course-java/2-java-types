package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        try {
            Byte.parseByte(input);
            return "byte";
        }
        catch (NumberFormatException e){}
        try {
            Short.parseShort(input);
            return "short";
        }
        catch (NumberFormatException e){}
        try {
            Integer.parseInt(input);
            return "int";
        }
        catch (NumberFormatException e){}
        try {
            Long.parseLong(input);
            return "long";
        }
        catch (NumberFormatException e){}

        return null;
    }

    public static void main(String[] args) {

        System.out.println(solution("896"));

    }

}
