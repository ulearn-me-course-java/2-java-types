package com.example.task02;

import java.math.BigDecimal;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

//        long x = Long.valueOf(input);
//        if (x < Byte.MAX_VALUE && x > Byte.MIN_VALUE){
//            return "byte";
//        } else if (x < Short.MAX_VALUE && x > Short.MIN_VALUE) {
//            return "short";
//        } else if (x < Integer.MAX_VALUE && x > Integer.MIN_VALUE) {
//            return "int";
//        } else {
//            return "long";
//        }

        BigDecimal a = new BigDecimal(input);
        if (a.compareTo(new BigDecimal(Byte.MAX_VALUE)) < 0 && a.compareTo(new BigDecimal(Byte.MIN_VALUE)) > 0) {
            return "byte";
        } else if (a.compareTo(new BigDecimal(Short.MAX_VALUE)) < 0 && a.compareTo(new BigDecimal(Short.MIN_VALUE)) > 0) {
            return "short";
        } else if (a.compareTo(new BigDecimal(Integer.MAX_VALUE)) < 0 && a.compareTo( new BigDecimal(Integer.MIN_VALUE)) > 0) {
            return "int";
        } else if (a.compareTo(new BigDecimal(Long.MAX_VALUE)) < 0 && a.compareTo( new BigDecimal(Long.MIN_VALUE)) > 0) {
            return "long";
        } else {
            return "BigDecimal";
        }

    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution("-126555555");
        System.out.println(result);

    }

}
