package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        String numStr = String.valueOf(value);
        int num = Integer.parseInt(new StringBuilder(numStr).reverse().toString());
        return num;
    }

    public static void main(String[] args) {
        int result = reverse(345765);
        System.out.println(result);
    }


}
