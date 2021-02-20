package com.example.task14;

public class Task14 {
    public static int reverse(int value) {
        StringBuilder sb = new StringBuilder(Integer
                .toString(value))
                .reverse();
        return Integer.parseInt(sb.toString());
    }
}
