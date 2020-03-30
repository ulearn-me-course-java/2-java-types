package com.example.task02;
import java.util.Scanner;

public class Task02 {

    public static String solution(String input) {

        long num = Long.parseLong(input);
        System.out.println("type of your number:");

        if(num>=-128 && num<=127) return "byte";
        else if (num>=-32_768 && num<=32_767) return "short";
        else if (num>=-2_147_483_648 && num<=2_147_483_647) return "int";
        else return "long";

    }

    public static void main(String[] args) {
        String result = solution("567");
        System.out.println(result);

    }

}
