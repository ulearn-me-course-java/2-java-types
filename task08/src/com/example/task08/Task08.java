package com.example.task08;

public class Task08 {

    public static boolean solution() {
        // TODO измените тип и значение переменной x, чтобы возвращалось значение true

        float x = Float.MAX_VALUE;
        return x == x + 1;

        /*
        * Так как самое большое число типа float записывается в виде 3,4........е+038f, при прибавлении единицы, ничего
        * существенно не изменится. Если брать числа намного меньше, значение может сильно поменяться.
        * Даже для Float.MAX_VALUE - 1 выражение равно true.
        * */
    }

    public static void main(String[] args) {
        System.out.println(solution());
    }

}
