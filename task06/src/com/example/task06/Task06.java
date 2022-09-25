package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int count = 0;
        int res = x + y;
        if(res != 0){
            while(res != 0){
                res /= 10;
                count++;
            }
            return count;
        }
        else return 1;
    }

    public static void main(String[] args) {

        int result = solution(12, 34);
        System.out.println(result);

    }

}
