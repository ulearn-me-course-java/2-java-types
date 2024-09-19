package com.example.task04;

import java.util.Objects;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        float answer;
        if (Objects.equals(operation, "/")) {
            answer = (float) a / b; //Приводим к float или а или б, чтобы не выполнялось деление без остатка
        } else if (Objects.equals(operation, "*")) {
            answer = a * b;
        } else if (Objects.equals(operation, "+")) {
            answer = a + b;
        } else {
            answer = a - b;
        }
        return answer;
    }

    public static void main(String[] args) {

        float result = calculate(-25, 5, "/");
        System.out.println(result);

    }

}
