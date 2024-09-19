package com.example.task02;


public class Task02 {

    public static String solution(String input) {

        byte tryByte;
        try{
            tryByte = Byte.parseByte(input);
            return "byte";
        } catch (NumberFormatException n){
            int a;
        }

        short tryShort;
        try{
            tryShort = Short.parseShort(input);
            return "short";
        } catch (NumberFormatException n){
            int a;
        }

        int tryInt;
        try{
            tryInt = Integer.parseInt(input);
            return "int";
        } catch (NumberFormatException n){
            int a;
        }

        long tryLong;
        try{
            tryLong = Long.parseLong(input);
            return "long";
        } catch (NumberFormatException n){
            int a;
        }

        return "another type";
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
