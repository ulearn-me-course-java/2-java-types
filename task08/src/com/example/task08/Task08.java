package com.example.task08;

public class Task08 {

    public static boolean solution() {
        // TODO измените тип и значение переменной x, чтобы возвращалось значение true

        double x = 100f / 0.0f;
        return x == x + 1;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение
        System.out.println(solution());
    }

}
