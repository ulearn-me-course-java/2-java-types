package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        if(a==0.0/0.0 && b==0.0/0.0) return true;
        if(a==1.0/0.0 && b==1.0/0.0) return true;
        double divider=Math.pow(10,precision);
        a= (float) (Math.ceil(a*divider)/divider);
        b= (float) (Math.ceil(b*divider)/divider);
        return a == b;
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
