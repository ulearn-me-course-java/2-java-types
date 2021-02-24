package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float result = 0f;

        if (operation.equals("+")){
            result = (float)a + b;
        }
        else if (operation.equals("-")){
            result = (float)a - b;
        }
        else if (operation.equals("*")){
            result = (float)a * b;
        }
        else if (operation.equals("/")){
            result = (float)a / b;
        }

        return result;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат

        float result = calculate(-25, 5, "/");
        System.out.println(result);

    }

}
