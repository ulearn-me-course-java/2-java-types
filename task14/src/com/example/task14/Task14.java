package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        String convertly = new String();
        while (value != 0) {
            convertly += value%10;
            value /=10;
        }
        return Integer.parseInt(convertly);
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
