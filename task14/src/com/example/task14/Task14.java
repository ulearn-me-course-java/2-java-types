package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        StringBuilder sb = new StringBuilder();
        String result = sb.append(value).reverse().toString();
        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
    }


}
