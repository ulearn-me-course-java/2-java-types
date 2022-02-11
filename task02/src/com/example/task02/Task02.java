package com.example.task02;

public class Task02 {

    public static void main(String[] args) {
        System.out.println(solution("-9223372036854775808"));
        System.out.println(solution("100"));
    }

    public static String solution(String input) {

        int realLength = 0;
        if (input.charAt(0) == '-')
            realLength = 1;

        if (input.length() - realLength <= 3)
            if (CompareByteToShort(input))
                return Types.ShortString;
            else
                return Types.ByteString;

        else if (input.length() - realLength <= 5)
            if (CompareShortToInt(input))
                return Types.IntString;
            else
                return Types.ShortString;

        else if (input.length() - realLength <= 10)
            if (CompareIntToLong(input))
                return Types.LongString;
            else
                return Types.IntString;

        else if (input.length() <= 20)
            if (CompareLongToError(input, realLength))
                return "";
            else
                return Types.LongString;

        return "";
    }

    private static boolean CompareByteToShort(String input) {
        if (input.charAt(0) != '-')
            return Short.parseShort(input) > 127;
        else
            return Short.parseShort(input) < -128;
    }

    private static boolean CompareShortToInt(String input) {
        if (input.charAt(0) != '-')
            return Integer.parseInt(input) > Short.MAX_VALUE;
        else
            return Integer.parseInt(input) < Short.MIN_VALUE;
    }

    private static boolean CompareIntToLong(String input) {
        if (input.charAt(0) != '-')
            return Long.parseLong(input) > Integer.MAX_VALUE;
        else
            return Long.parseLong(input) < Integer.MIN_VALUE;
    }

    private static boolean CompareLongToError(String input, Integer num) {
        long longLimit = Long.MAX_VALUE;
        if (num == 1)
            longLimit = Long.MIN_VALUE;

        for (int i = num; i < Math.max(input.length(), Long.toString((longLimit)).length()); i++) {
            if (input.charAt(i) != Long.toString((longLimit)).charAt(i))
                return (int) input.charAt(i) > (int) Long.toString((longLimit)).charAt(i);
        }

        return false;
    }
}

class Types {
    public static String IntString = "int";
    public static String LongString = "long";
    public static String ShortString = "short";
    public static String ByteString = "byte";
}
