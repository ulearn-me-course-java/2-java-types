package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        int lenght = String.valueOf(value).length();
        int result = 0;
        for (int i = 0; i < lenght; i++) {
            result += ((value / (int) Math.pow(10, i)) % 10) * Math.pow(10, lenght - i - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int result = reverse(3457);
        System.out.println(result);
    }


}
