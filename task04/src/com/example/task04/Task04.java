package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float f1 = a;
        float f2 = b;
        if (operation == "/")
            return (float)a / b;
        if (operation == "+")
            return a + b;
        if (operation == "-")
            return a - b;
        if (operation == "*")
            return a * b;

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        return 0;
    }

    public static void main(String[] args) {

        float result = calculate(5, 2, "/");
        System.out.println(result);

    }

}
