package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        if(x+y==0) return 1;
        int result=0;
        int sum=x+y;
        while(sum!=0) {
            sum /= 10;
            result++;
        }



        return 0;
    }

    public static void main(String[] args) {

        int result = solution(12, 34);
        System.out.println(result);

    }

}
