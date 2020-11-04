package com.example.task10;

public class Task10
{
    public static boolean compare(float a, float b, int precision)
    {
        if ((Float.isNaN(a) ^ Float.isNaN(b)))
            return false;
        double e =  1d / (Math.pow(10, precision));
        float c = Math.abs(a - b);
        if (Float.isNaN(c))
            return (Float.NEGATIVE_INFINITY != a || Float.POSITIVE_INFINITY != b)
                    && (Float.NEGATIVE_INFINITY != b || Float.POSITIVE_INFINITY != a);
        return c < e;
    }

    public static void main(String[] args)
    {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;
        boolean result = compare(sum, c, 2);
        System.out.println(result);
    }
}
