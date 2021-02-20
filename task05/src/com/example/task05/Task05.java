package com.example.task05;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Task05 {
    public static String solution(int x) {
        while (x != 0) {
            if (x % 2 != 0) {
                return "FALSE";
            }
            x /= 10;
        }
        return "TRUE";
    }
}
