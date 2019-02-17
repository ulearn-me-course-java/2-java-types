package com.example.task02;

import com.sun.xml.internal.fastinfoset.util.CharArray;

public class Task02 {

    public static String solution(String input) {
        if(tryParseByte(input)) return "byte";
        if(tryParseShort(input)) return  "short";
        if(tryParseInt(input)) return "int";
        if(tryParseLong(input)) return "long";
        if(input.toCharArray().length == 1) return "char";
        else return "Its No Integral Type";
    }

    private static boolean tryParseByte(String value) {
        try{
            Byte.parseByte(value);
            return true;
        }
        catch (Exception ex) { return false; }
    }

    private static boolean tryParseInt(String value) {
        try{
            Integer.parseInt(value);
            return true;
        }
        catch (Exception ex) { return false; }
    }
    private static boolean tryParseShort(String value) {
        try{
            Short.parseShort(value);
            return true;
        }
        catch (Exception ex) { return false; }
    }
    private static boolean tryParseLong(String value) {
        try {
            Long.parseLong(value);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(solution("9"));
        System.out.println(solution("E"));
        System.out.println(solution("Э"));
    }

}
