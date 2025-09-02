package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        String s = String.valueOf(value);
        char[] chars = s.toCharArray();

        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }

        return Integer.parseInt(reversed);
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
    }


}
