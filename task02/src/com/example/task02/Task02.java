package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        if(tryParseByte(input)) return "byte";
        if(tryParseShort(input)) return  "short";
        if(tryParseInt(input)) return "int";
        if(tryParseLong(input)) return "long";
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
        try{
            Long.parseLong(value);
            return true;
        }
        catch (Exception ex) { return false; }
    }
   // private static boolean tryParseInt(String value)
    public static void main(String[] args) { }

}
