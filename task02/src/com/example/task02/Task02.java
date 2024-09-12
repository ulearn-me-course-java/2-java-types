package com.example.task02;

public class Task02 {

    public static String solution(String input) {


        String res = "";
        if (Long.parseLong(input) <= Byte.MAX_VALUE && Long.parseLong(input) >= Byte.MIN_VALUE)
            return "byte";

        else if (Long.parseLong(input) <= Short.MAX_VALUE && Long.parseLong(input) >= Short.MIN_VALUE)
            return "short";

        else if (Long.parseLong(input) <= Integer.MAX_VALUE && Long.parseLong(input) >= Integer.MIN_VALUE)
            return "int";

        return "long";
    }

    public static void main(String[] args) {

        String result = solution("12345");
        System.out.println(result);

    }

}
