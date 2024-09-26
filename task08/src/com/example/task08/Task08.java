package com.example.task08;

import org.graalvm.compiler.core.common.type.FloatStamp;

public class Task08 {

    public static boolean solution() {
        // TODO измените тип и значение переменной x, чтобы возвращалось значение true

        float x = 1000000000;
        return x == x + 1;
    }

    public static void main(String[] args) {
        System.out.println(solution());

    }

}
