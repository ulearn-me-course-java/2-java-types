package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        float num1 = (float) a;
        float num2 = (float) b;

        if (operation.equals("+"))
            num1 += num2;
        else if (operation.equals("-"))
            num1 -= num2;
        else if (operation.equals("*"))
            num1 *= num2;
        else if (operation.equals("/"))
            num1 /= num2;

        return num1;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        float result = calculate(10_000_000, 0, "/");
        System.out.println(result);
    }

}
