package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
       x+=y;
       String str = Integer.toString(x);
       if(str.contains("-")){
           return str.length()-1;
       }
        return str.length();
    }

    public static void main(String[] args) {

        int result = solution(12, 34);
        System.out.println(result);

    }

}
