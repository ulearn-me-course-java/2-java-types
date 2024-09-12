package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        int sum = x+y;
        String sumStr = Integer.toString(sum);
        int count = 0;
        for (int i = 0; i<sumStr.length();i++){
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        int result = solution(12, 34);
        System.out.println(result);

    }

}
