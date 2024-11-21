package com.example.task14;

public class Task14 {


    public static int reverse(int value)
    {

        // TODO напишите здесь код, переставляющий цифры числа в обратном порядке
        int result = 0;

        int valueLevel = getLevel(Integer.toString(value).length());

        while (value > 0)
        {
            int digit = value % 10;
            result += digit * valueLevel;
            valueLevel /= 10;
            value /= 10;
        }

        return result;
    }
    public static int getLevel(int length){
        int level = 1;
        while (length - 1 > 0){
            level *= 10;
            length--;
        }
        return level;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = reverse(345);
        System.out.println(result);
    }


}
