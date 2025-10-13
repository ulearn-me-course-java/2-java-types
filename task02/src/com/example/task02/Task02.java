package com.example.task02;

import java.util.Scanner;

public class Task02 {

    public static String solution(String input) {
        Long inputNumber = Long.parseLong(input);

        if (Byte.MIN_VALUE <= inputNumber && inputNumber <= Byte.MAX_VALUE){
            return "byte";
        }
        else if (Short.MIN_VALUE <= inputNumber && inputNumber <= Short.MAX_VALUE){
            return "short";
        }
        else if (Integer.MIN_VALUE <= inputNumber && inputNumber <= Integer.MAX_VALUE){
            return "int";
        }
        else if (Long.MIN_VALUE <= inputNumber && inputNumber <= Long.MAX_VALUE){
            return "long";
        }
        else return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        String inputLine = scanner.nextLine();

        do {
            System.out.println(solution(inputLine));

            System.out.println("Введите число: ");
            inputLine = scanner.nextLine();
        } while (inputLine!= null);
    }
}
