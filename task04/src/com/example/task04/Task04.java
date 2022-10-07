package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float x = (float)a;
        float y = (float)b;

        if(operation == "+")
            return x + y;
        else if(operation == "-")
            return x - y;
        else if(operation == "*")
            return x * y;
        else
            return x / y;
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
