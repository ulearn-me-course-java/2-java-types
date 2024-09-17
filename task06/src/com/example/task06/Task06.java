package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        int sum = x + y;
        int result = String.valueOf(sum).length();
        if (sum < 0) {
            return result - 1;
        } else {
            return result;
        }

    }

    public static void main(String[] args) {
    }

}
