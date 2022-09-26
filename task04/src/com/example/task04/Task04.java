package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        float afl = (float)a;
        float bfl = (float)b;
        float result = 0;

        if(operation.equals("-"))
            result = (afl - bfl);
        else if(operation.equals("+"))
            result = afl + bfl;
        else if (operation.equals("*"))
            result = afl * bfl;
        else if (operation.equals("/") && bfl != 0)
            result = afl / bfl;

        System.out.println(7.0f);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculate(-25,5,"/"));
    }

}
