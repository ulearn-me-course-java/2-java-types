package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        String str = "";
        while (value != 0){
            str += value % 10;
            value /= 10;
        }
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);

    }


}
