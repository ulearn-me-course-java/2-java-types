package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        String res = Integer.toString(x + y);
        if(x + y  < 0){
            return res.length() - 1;
        }

        return res.length();
    }

    public static void main(String[] args) {

        int result = solution(563, 6293);
        System.out.println(result);

    }

}
