package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        if(Float.isNaN(a) && Float.isNaN(b))
            return true;
        else if (Float.isNaN(a) || Float.isNaN(b))
            return false;
        if(Float.isInfinite(a) && Float.isInfinite(b)){
            if (a>0 && b>0 || a<0 && b<0)
                return true;
            else
                return false;
        }
        double val = Math.pow(10, -precision);
        return Math.abs(a-b)<val;
    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(sum, c, 2);
        boolean r_2 = compare(0.70000005f, 0.7f, 2);
        System.out.println(r_2);

    }

}
