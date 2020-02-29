package com.example.task02;

import java.math.BigInteger;

class TypeInfo implements Comparable<TypeInfo> {
    BigInteger maxValue,
            minValue;
    int countByte;
    String name;

    TypeInfo(long maxValue, String name, int countByte) {
        this.maxValue = BigInteger.valueOf(maxValue);
        this.name = name;
        this.countByte = countByte;
        this.minValue = BigInteger.valueOf(-maxValue - 1);
    }

    public boolean check(BigInteger number) {
        return number.compareTo(maxValue) < 1 && number.compareTo(minValue) > -1;
    }

    @Override
    public int compareTo(TypeInfo typeInfo) {
        return Integer.compare(this.countByte, typeInfo.countByte);
    }
}