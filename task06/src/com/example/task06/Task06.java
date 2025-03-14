package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        int result = x + y;
        int count = 0;
        while (result != 0) {
            count++;
            result /= 10;
        }
        if (count == 0) return 1;

        return count;
    }

    public static void main(String[] args) {

        int result = solution(559, 34);
        System.out.println(result);

    }

}
