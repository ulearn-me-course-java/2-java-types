package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = reverse(345);
        System.out.println(result);
         */
    }


}
