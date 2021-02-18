package com.example.task02;

import java.util.Scanner;

public class Task02 {

    public static String solution(String input) {
        if (tryParseByte(input)) {
            return "byte";
        } else if (tryParseShort(input)) {
            return "short";
        } else if (tryParseInt(input)) {
            return "int";
        } else if (tryParseLong(input)) {
            return "long";
        }

        return "unexpected";
    }

    public static boolean tryParseByte(String input) {
        try {
            Byte.parseByte(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean tryParseShort(String input) {
        try {
            Short.parseShort(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean tryParseInt(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean tryParseLong(String input) {
        try {
            Long.parseLong(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine())
            System.out.println(solution(scanner.nextLine()));
    }
}
