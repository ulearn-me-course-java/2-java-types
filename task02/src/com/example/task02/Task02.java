package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        try {
            Byte.parseByte(input);
            return "byte";
        }
        catch (Exception ignored){
        }

        try {
            Short.parseShort(input);
            return "short";
        }
        catch (Exception ignored){
        }

        try {
            Integer.parseInt(input);
            return "int";
        }
        catch (Exception ignored){
        }

        return "long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution("24234242222");
        System.out.println(result);

    }

}
