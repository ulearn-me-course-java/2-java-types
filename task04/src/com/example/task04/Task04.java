package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float res = 0;
        if(operation.equals("+")){
            res = a+b;
        }
        if(operation.equals("-")){
            res = a-b;
        }
        if(operation.equals("/")){
            res = (float) a/b;
        }
        if(operation.equals("*")){
            res = a*b;
        }
        return res;
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
