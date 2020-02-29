package com.example.task04;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Task04 {
    @FunctionalInterface
    interface Operationable {
        float calculate(int x, int y);
    }
    static Map<String, Operationable> operations = getDefaultOperation();

    private static Map<String, Operationable> getDefaultOperation() {
        Map<String, Operationable> operation = new HashMap<>();
        operation.put("+", (x, y) -> (float) x + y);
        operation.put("-", (x, y) -> (float) x - y);
        operation.put("*", (x, y) -> (float) x * y);
        operation.put("/", (x, y) -> (float) x / y);
        return operation;
    }

    public static float calculate(int a, int b, String operation) {
        return operations.get(operation)
                .calculate(a, b);
    }

    public static void main(String[] args) {
        float result = calculate(-25, 5, "/");
        System.out.println(result);
    }

}
