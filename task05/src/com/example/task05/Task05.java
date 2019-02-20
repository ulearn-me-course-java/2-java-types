package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        String numbers = "02468";
        char[] arrayX = Integer.toString(x).toCharArray();
        for (int i =0; arrayX.length > i; i++){
            if (numbers.indexOf(arrayX[i]) == -1)
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
