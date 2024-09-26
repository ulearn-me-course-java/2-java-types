package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        if(a == 1f/0f && b == 1f/0f)
            return true;
        if(a == -1f/0f && a == -1f/0f)
            return true;
        if(a == -1f/0f && b == 1f/0f || a == 1f/0f && b == -1f/0f)
            return false;

        String stringA = Float.toString(a);
        String stringB = Float.toString(b);

        int indexCommaA = stringA.indexOf('.') + precision;
        int indexCommaB = stringB.indexOf('.') + precision;

        if(indexCommaA != indexCommaB)
            return false;

        for(int i = 0; i < Math.min(stringA.length(), stringB.length()); i++){

            if(stringA.charAt(i) != stringB.charAt(i))
                return false;

            if(i + 1 > indexCommaA)
                break;
        }

        return true;

    }

    public static void main(String[] args) {
        /**float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(sum, c, 2);
        System.out.println(result);*/
        System.out.println(compare(100.001f, 100.009f, 3));


    }

}
