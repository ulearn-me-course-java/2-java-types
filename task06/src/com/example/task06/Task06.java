package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        return countOfDigit(x+y);
    }
    public static int countOfDigit(int sum){
        if (String.valueOf(sum).contains("-"))
            return (String.valueOf(sum).length() - 1);
        else return String.valueOf(sum).length();
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int result = solution(12, 34);
        System.out.println(result);
    }

}
