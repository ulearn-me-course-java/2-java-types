package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        float NumA = (float)a;
        float NumB = (float)b;
        switch (operation){
            case "+":
                return NumA + NumB;
            case "-":
                return NumA-NumB;
            case "*":
                return NumA*NumB;
            case "/":
                return NumA/NumB;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        float result = calculate(-25, 5, "/");
        System.out.println(result);

    }

}
