package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        int sum = x + y;
        return String.valueOf(Math.abs(sum)).length();
    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }
}
