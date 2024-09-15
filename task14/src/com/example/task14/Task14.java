package com.example.task14;

public class Task14 {


    public static int reverse(int value)
    {
        StringBuilder sBValue = new StringBuilder(Integer.toString(value)).reverse();
        String strValue = sBValue.toString();
        return Integer.parseInt(strValue);
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
