package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        int temporaryVariable=x;
        boolean isAllDigitEven=true;
        do {
            isAllDigitEven&=((temporaryVariable%10)%2==0);
            temporaryVariable/=10;
        }while (temporaryVariable>0);

        return isAllDigitEven
                ? "TRUE"
                : "FALSE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution(1);
        System.out.println(result);

    }

}
