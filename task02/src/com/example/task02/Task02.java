package com.example.task02;

import java.math.BigInteger;
import java.util.Arrays;

public class Task02 {

    static TypeInfo byteInfo = new TypeInfo(Byte.MAX_VALUE, "byte", Byte.BYTES);
    static TypeInfo shortInfo = new TypeInfo(Short.MAX_VALUE, "short", Short.BYTES);
    static TypeInfo intInfo = new TypeInfo(Integer.MAX_VALUE, "int", Integer.BYTES);
    static TypeInfo longInfo = new TypeInfo(Long.MAX_VALUE, "long", Long.BYTES);
    static TypeInfo[] defaultTypes = {byteInfo, shortInfo, intInfo, longInfo};

    public static String solution(String input, TypeInfo[] typesInfo) {
        BigInteger number = new BigInteger(input);
        Arrays.sort(typesInfo);
        for (TypeInfo type : typesInfo) if (type.check(number)) return type.name;
        throw new IllegalArgumentException("too big number");
    }

    public static String solution(String input) {
        return solution(input, defaultTypes);
    }


    public static void main(String[] args) {
        String result = solution("1111111111111111111111111111111111111111111111111111111111111");
        System.out.println(result);
    }
}

