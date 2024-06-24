package com.example.task14;

import com.sun.org.apache.xpath.internal.operations.String;

public class Task14 {


    public static int reverse(int value) {
        return Integer.parseInt(new StringBuffer(Integer.toString(value)).reverse().toString());
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = reverse(345);
        System.out.println(result);
         */
    }


}
