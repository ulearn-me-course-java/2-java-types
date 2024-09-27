package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        if(Double.isNaN(a) && Double.isNaN(b))
            return true;
        else if((Double.isNaN(a) && !Double.isNaN(b)) || (!Double.isNaN(a) && Double.isNaN(b)))
            return  false;
        else if(((Double.POSITIVE_INFINITY == a) && (Double.POSITIVE_INFINITY == b))
                || (Double.NEGATIVE_INFINITY == b) && (Double.NEGATIVE_INFINITY == a))
            return  true;
        return Math.abs(a - b) < Math.pow(10, -precision);
    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(sum, c, 2);
        System.out.println(result);

    }

}
