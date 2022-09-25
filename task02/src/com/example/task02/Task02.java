package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long lg = Long.parseLong(input);
        int in = (int) lg;
        if(in==lg)
        {
            short sh =(short) in;
            if(sh == in) {
                byte by = (byte) sh;
                if(by == sh) {
                    return "byte";
                }
                else {
                    return "short";
                }
            }
            else{
                return"int";
            }
        }
        return "long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        String result = solution("12345");
        System.out.println(result);
    }

}
