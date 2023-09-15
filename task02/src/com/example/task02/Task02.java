package com.example.task02;
import java.util.Scanner;
public class Task02 {

    public static String solution(String input) {

        long num = Long.parseLong(input);
        if (num < 128){
            return "byte";
        }
        else if (num < 32768){
            return "short";
        }
        else if (num < 2147483647){
            return "int";
        }
        else {
            return "long";
        }
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        String type = solution(num);
        System.out.println(type);
    }

}
