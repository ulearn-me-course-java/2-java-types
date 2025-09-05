package com.example.task14;

import org.assertj.core.extractor.ToStringExtractor;
import org.assertj.core.internal.bytebuddy.implementation.ToStringMethod;

public class Task14 {


    public static int reverse(int value) {

        String strNum = String.valueOf(value);
        return Integer.parseInt(new StringBuilder(strNum).reverse().toString());
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);

    }


}
