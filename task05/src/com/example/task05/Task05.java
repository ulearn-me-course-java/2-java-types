package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        boolean ifAllEven = true;
        while (x > 0)
        {
            if (x % 10 % 2 != 0)
            {
                ifAllEven = false;
            }
            x /= 10;
        }
        return String.valueOf(ifAllEven).toUpperCase();
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution(1234);
        System.out.println(result);

    }

}
