package com.example.task02;

import java.io.IOException;

public class Task02 {

    public static String solution(String input) {
        int opt = 4;
        try
        {
            long n;
            n = Long.parseLong(input);
            opt = 3;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try
        {
            int n;
            n = Integer.parseInt(input);
            opt = 2;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try
        {
            short n;
            n = Short.parseShort(input);
            opt = 1;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try
        {
            byte n;
            n = Byte.parseByte(input);
            opt = 0;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String result;
        if(opt == 0) result = "byte";
        else if(opt == 1) result = "short";
        else if(opt == 2) result = "int";
        else if(opt == 3) result = "long";
        else result = "не парсится";

        return result;
    }

    public static void main(String[] args) {

        String result = solution("12345");
        System.out.println(result);

    }

}
