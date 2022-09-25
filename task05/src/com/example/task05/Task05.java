package com.example.task05;

public class Task05 {

    public static String solution(int x) {
       if (x>0) {
           x/=10;
           if (x>0) {
               x/=10;
               if (x>0) {
                   x/=10;
                   if (x>0) {
                       x/=10;
                       if (x==0) {
                           return  "True";
                       }
                   }
               }
           }
       }
       return "FALSE";
    }

    public static void main(String[] args) {

        String result = solution(1234);
        System.out.println(result);

    }

}
