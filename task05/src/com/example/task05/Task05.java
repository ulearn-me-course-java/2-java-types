package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        while (x != 0) {
            int lastDig = x % 10;
            x /= 10;
            if (!isEven(lastDig))
                return "FALSE";
        }
        return "TRUE";
    }

    public  static boolean isEven(int dig){
        return dig % 2 == 0;
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }

}
