package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        // TODO напишите здесь код, переставляющий цифры числа в обратном порядке
        String str = "" + value;
        StringBuilder sb = new StringBuilder(str).reverse();
        str = sb.toString();
        int num = Integer.parseInt(str);
        return num;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int result = reverse(35);
        System.out.println(result);
    }


}
