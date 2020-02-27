package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float n = 0;
        float c = a;
        float d = b;
        switch (operation){
            case "+":
                n = c + d;
                break;
            case "-":
                n = c - d;
                break;
            case "/":
                n = c / d;
                break;
            case "*":
                n = c * d;
                break;
        }
        return n;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        float result = calculate(-21, 5, "/");
        System.out.println(result);
    }

}
