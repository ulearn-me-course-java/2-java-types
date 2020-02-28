package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float ans = 0;

        if (operation == "+")
            ans = a + b;
        else if (operation == "-")
            ans = a - b;
        else if (operation == "/")
            ans = (float) a / b;
        else if (operation == "*")
            ans = a * b;
        return ans;
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
