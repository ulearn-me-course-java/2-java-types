package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        String sumstr = Integer.toString(x + y);
	if (sumstr.startsWith("-"))
	    return sumstr.length() - 1;
        return sumstr.length();
    }

    public static void main(String[] args) {
        /*
        int result = solution(12, 34);
        System.out.println(result);
        */
    }

}
