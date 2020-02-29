package com.example.task02;

import java.math.BigInteger;
import java.util.Arrays;

public class Task02 {


    public static String solution(String input, TypeInfo[] typesInfo) {
        BigInteger number = new BigInteger(input);
        Arrays.sort(typesInfo);
        for (TypeInfo type : typesInfo) if (type.check(number)) return type.name;
        throw new IllegalArgumentException("too big number");
    }

    public static String solution(String input) {
        return solution(input, TypeInfo.getDefaultType());
    }


    public static void main(String[] args) {
        String result = solution("1111111111111111111111111111111111111111111111111111111111111");
        System.out.println(result);
    }
}

