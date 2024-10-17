package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        float result;
        switch (operation)
        {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = (float) a / b;
                    break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
        return result;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        float result = calculate(-25, 5, "/");
        System.out.println(result);

    }

}
