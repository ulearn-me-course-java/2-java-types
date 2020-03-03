package com.example.task02;

import java.math.BigInteger;

public class Task02 {

    public static String solution(String input) {
        BigInteger in = new BigInteger(input);
        if (in.compareTo(new BigInteger("-129"))
                > in.compareTo(new BigInteger("128")))
            return "byte";
        else if (in.compareTo(new BigInteger("-32769"))
                > in.compareTo(new BigInteger("32768")))
            return "short";
        else if (in.compareTo(new BigInteger("-2147483649"))
                > in.compareTo(new BigInteger("2147483648")))
            return "int";
        else if (in.compareTo(new BigInteger("-9223372036854775809"))
                > in.compareTo(new BigInteger("9223372036854775808")))
            return "long";
        else
            return "very big number!";
    }

    public static void main(String[] args) {

    }

}
