package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        String x = String.valueOf(value);
        String y = new StringBuilder(x).reverse().toString();
        int z = Integer.parseInt(y);
        return z;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = reverse(34544);
        System.out.println(result);

    }


}
