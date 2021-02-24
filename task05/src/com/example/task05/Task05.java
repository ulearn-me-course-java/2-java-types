package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        String flag = "TRUE";
        String[] arr = String.valueOf(x).split("");
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) % 2 != 0) {
                flag = "FALSE";
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(solution(44880));
    }

}
