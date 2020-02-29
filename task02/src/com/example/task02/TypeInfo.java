package com.example.task02;

import java.math.BigInteger;

class TypeInfo implements Comparable<TypeInfo> {
    private final BigInteger maxValue,
            minValue;
    public final int countByte;
    public final String name;

    TypeInfo(BigInteger maxValue, String name, int countByte) {
        this.minValue = maxValue.negate().subtract(BigInteger.ONE);
        this.maxValue = maxValue;
        this.name = name;
        this.countByte = countByte;

    }

    TypeInfo(long maxValue, String name, int countByte) {
        this.maxValue = BigInteger.valueOf(maxValue);
        this.name = name;
        this.countByte = countByte;
        this.minValue = BigInteger.valueOf(-maxValue - 1);
    }

    public boolean check(BigInteger number) {
        return number.compareTo(maxValue) < 1 && number.compareTo(minValue) > -1;
    }

    public static TypeInfo[] getDefaultType() {
        TypeInfo byteInfo = new TypeInfo(Byte.MAX_VALUE, "byte", Byte.BYTES);
        TypeInfo shortInfo = new TypeInfo(Short.MAX_VALUE, "short", Short.BYTES);
        TypeInfo intInfo = new TypeInfo(Integer.MAX_VALUE, "int", Integer.BYTES);
        TypeInfo longInfo = new TypeInfo(Long.MAX_VALUE, "long", Long.BYTES);
        return new TypeInfo[]{byteInfo, shortInfo, intInfo, longInfo};
    }

    @Override
    public int compareTo(TypeInfo typeInfo) {
        return Integer.compare(this.countByte, typeInfo.countByte);
    }
}