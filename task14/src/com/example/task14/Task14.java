package com.example.task14;

import java.util.Scanner;

public class Task14 {


    public static int reverse(int value) {
        String rev = new StringBuilder(Integer.toString(value)).reverse().toString();
        int x = Integer.parseInt(rev);
        return x;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number = ");
        int n = in.nextInt();

        System.out.print(reverse(n));
    }


}
