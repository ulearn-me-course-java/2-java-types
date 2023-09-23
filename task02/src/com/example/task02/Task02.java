package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        try {
            Byte.parseByte(input);
            return "byte";
        }
        catch (Exception ex){}
        try{
            Short.parseShort(input);
            return "short";
        }
        catch (Exception ex){}
        try {
            Integer.parseInt(input);
            return "int";
        }
        catch (Exception ex){}
        try{
            Long.parseLong(input);
            return "long";
        }
        catch (Exception ex){}
        return "";
    }

    public static void main(String[] args) {
        String result = solution("2500000000");
        System.out.println(result);
    }

}
