package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        // TODO напишите здесь код, переставляющий цифры числа в обратном порядке
String str = String.valueOf(value);
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sbReverse = sb.reverse();
        str = String.valueOf(sbReverse);
        int result = Integer.valueOf(str);
        return result;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
       
        int result = reverse(345);
        System.out.println(result);
        
    }


}
