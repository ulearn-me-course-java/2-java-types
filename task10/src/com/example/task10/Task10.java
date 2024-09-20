package com.example.task10;

public class Task10
{

    public static boolean compare(float a, float b, int precision)
    {

        if (Float.isNaN(a) && Float.isNaN(b))
        {
            return true;
        }
        else if (precision == 0)
        {
            return a==b;
        }

        else if (Float.isInfinite(a) && Float.isInfinite(b) && !Float.isNaN(a + b))
        {
            return true;
        }

        return Math.abs(a-b) < Math.pow(10, -precision);
    }

    public static void main(String[] args)
    {
        float a = 0.5f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.9f;

        boolean result = compare(sum, c, 2);
        System.out.println(result);

    }

}
