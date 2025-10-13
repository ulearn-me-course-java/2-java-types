package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        Float aFloat = (float) a;
        Float bFloat = (float) b;


        if (operation == "+") return aFloat+bFloat;
        if (operation == "-") return aFloat-bFloat;
        if (operation == "*") return aFloat*bFloat;
        if (operation == "/") return aFloat/bFloat;
        else return 0;
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
