package com.example.task13;

import java.util.Scanner;

public class Task13 {

    public static char toUpperCase(char c) {

        return (char)(int)(c-32);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Letter = ");
        char l = in.next().charAt(0);

        System.out.print(toUpperCase(l));
    }

}
