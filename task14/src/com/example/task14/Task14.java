package com.example.task14;

import java.util.*;

public class Task14 {

    public static int reverse(int value) {

        String[] digits = String.valueOf(value).split("");
        String resValue ="";
        for (int i = digits.length-1; i >= 0; i--) {
            resValue+=digits[i];
        }
        return Integer.parseInt(resValue);
    }

    public static void main(String[] args) {
    }


}
