package com.example.task02;

public class Task02 {
    public static String solution(String input) {
        String type;
        long number = Long.parseLong(input);

        if ((-128 <= number) && (number <= 127))
        {
            type = "byte";
        }
        else if ((-32768 <= number) && (number <= 32767))
        {
            type = "short";
        }
        else if ((-2147483648 <= number) && (number <= 2147483647))
        {
            type = "int";
        }
        else
        {
            type = "long";
        }
        return type;
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }
}
