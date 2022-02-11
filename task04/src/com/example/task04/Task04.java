package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        Float aFl = Float.valueOf(Integer.toString(a));
        Float bFl = Float.valueOf(Integer.toString(b));

        switch (operation){
            case Operands.Plus :
                return aFl + bFl;
            case Operands.Minus:
                return aFl - bFl;
            case Operands.Div:
                return aFl / bFl;
            case Operands.Mult:
                return aFl * bFl;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }    

    }

    public static void main(String[] args) {
        System.out.println(calculate(-25, 5, "/"));
    }
}
class Operands{
    public final static String Plus = "+";
    public final static String Minus = "-";
    public final static String Mult = "*";
    public final static String Div = "/";
}
