package com.example.task05;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Task05 {

    public static String solution(int x) {
        if(x <= 99999 && x >= 0) {
            char[] str = Integer.toString(x).toCharArray();
            byte res = 0;

            for(byte i = 0; i < str.length; i++)
            {
                if((str[i] % 2) == 0) res++;
                else break;
            }

            if(res == str.length) return "TRUE";
            else return "FALSE";
        }

        else return "Incorrect number";
    }


    public static void main(String[] args) {
        System.out.println(solution(888888));
        System.out.println(solution(-1));
        System.out.println(solution(88888));
        System.out.println(solution(89898));
    }
}