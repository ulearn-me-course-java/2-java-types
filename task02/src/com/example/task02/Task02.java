package com.example.task02;

public class Task02 {

    public static String solution(String input) {


        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        byte bytes = 0;
        try{
            bytes = Byte.parseByte(input);
            return "byte";
        } catch (Exception e){

        }

        short shorts = 0;
        try{
            shorts = Short.parseShort(input);
            return "short";
        } catch (Exception e){

        }
        int ints = 0;
        try{
            ints = Integer.parseInt(input);
            return "int";
        } catch (Exception e){

        }

        long longs = 0;
        try{
            longs = Long.parseLong(input);
            return "long";
        } catch (Exception e){

        }


        return "";
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
