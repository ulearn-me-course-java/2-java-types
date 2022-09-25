package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        int a = 0;
        int b = 0;
        while (x != 0) {
            if (x % 2 == 0) {
                a++;
            } else {
                b++;
            }
            x = x / 10;
        }
        if(a>0 && b == 0){
            return "True";
        }else{
            return "False";
        }
    }

    public static void main(String[] args) {

        String result = solution(2144);
        System.out.println(result);

    }

}
