package com.example.task06;

public class Task06 {
    public static int solution(int x, int y) {
        int sum = x+y;
        if ((sum)<0) return String.valueOf(sum).length()-1;
        return String.valueOf(sum).length();
    }

    public static void main(String[] args) {
        int result = solution(122, 34);
        System.out.println(result);
    }

}
