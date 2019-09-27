package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        String res = Integer.toString(x + y);
        if (x + y >= 0)
            return res.length();
        else
            return res.length() - 1;
        return 0;
    }

    public static void main(String[] args) {

    }

}
