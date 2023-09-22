package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        boolean result = false;
        char[] number = String.valueOf(x).toCharArray();
        for (char i :
                number) {
            if (Integer.parseInt(String.valueOf(i)) % 2 == 0) continue;
            result = true;
        }
        return result ? "FALSE" : "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution(1234);
        System.out.println(result);

    }

}
