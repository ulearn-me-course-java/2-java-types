package com.example.task04;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        switch (operation){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return (float)a/b;
            default:
                throw new NotImplementedException();
        }
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
