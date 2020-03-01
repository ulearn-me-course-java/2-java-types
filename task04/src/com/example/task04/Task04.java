package com.example.task04;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        return makeCalculator().get(operation).apply((float) a, (float) b);
    }

    private static Map<String, BiFunction<Float, Float, Float>> makeCalculator() {
        return new HashMap<String, BiFunction<Float, Float, Float>>() {{
            put("+", Float::sum);
            put("-", (x, y) -> x - y);
            put("*", (x, y) -> x * y);
            put("/", (x, y) -> x / y);
        }};
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        float result = calculate(-25, 5, "/");
        System.out.println(result);
        */
    }

}
