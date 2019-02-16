package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        switch (operation){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return (float) a / b;
            default:
                throw new IllegalArgumentException("Operation: " + operation + "is not supported");
        }
    }

    public static void main(String[] args) throws Exception {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        float result = calculate(-25, 5, "/gh");
        System.out.println(result);
        */
    }

}
