package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum = x + y;
        return getLength(sum);
    }

    public  static  int getLength(int num){
        if (num == 0) return 1;

        int length = 0;
        while (num != 0){
            num /= 10;
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }

}
