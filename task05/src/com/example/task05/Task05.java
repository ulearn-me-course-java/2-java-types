package com.example.task05;

import javafx.scene.control.TableRow;

public class Task05 {

    public static String solution(int x) {
        int flag = 1;
        String res = "";
        while (x > 0) {
            if ((x % 10) % 2 == 0) {
                x = x / 10;
            }
            else{
                flag = 0;
                x = x/10;
            }



        }
        if (flag == 1)
            res = "TRUE";
        else
            res = "FALSE";

        return res;
    }

    public static void main(String[] args) {

        String result = solution(1234);
        System.out.println(result);

    }

}
