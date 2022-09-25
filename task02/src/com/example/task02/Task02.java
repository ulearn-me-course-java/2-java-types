package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long lg = Long.parseLong(input);
        int in = (int)lg;
        if (lg == in){
            short sh = (short) in;
                if (in == sh){
                byte bt = (byte) sh;
                    if(sh == bt){
                        return "byte";
                    }
                    else {
                        return "short";
                    }
                }
                else{
                    return "int";
                }
            }
        return "long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
    }

}
