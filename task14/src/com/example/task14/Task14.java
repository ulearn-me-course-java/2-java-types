package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        StringBuilder sb = new StringBuilder(String.valueOf(value));
        sb.reverse();
        if(!sb.toString().isEmpty()) {
            return Integer.parseInt(sb.toString());
        }
        return 0;
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
    }


}
