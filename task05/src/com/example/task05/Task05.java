package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        int y;
        while(x != 0)
        {
            y = x%10;
            x = x/10;
            if(y % 2 != 0)
                return "FALSE";
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        String result = solution(17395);
    }
}
