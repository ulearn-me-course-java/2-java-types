package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        String xStr = Integer.toString(x);
        for (int i = 0; i < xStr.length(); i++)
        {
            if(Integer.parseInt(Character.toString(xStr.charAt(i))) % 2 == 1)
                return "FALSE";
        }

        return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution(1234);
        System.out.println(result);
        */
    }

}
