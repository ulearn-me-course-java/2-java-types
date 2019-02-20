package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long parseInput = Long.valueOf(input);
		
        if (parseInput == (byte)parseInput)
            return "byte";
		
        if (parseInput == (short)parseInput)
            return "short";
		
        if (parseInput == (int)parseInput)
            return "int";
		
        return "long";
    }

    public static void main(String[] args) {
		
    }

}
