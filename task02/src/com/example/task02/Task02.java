package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        int length = input.length();
        if (input.charAt(0) == '-')
        {
            length -= 1;
        }

        if (length <= 3 && Short.parseShort(input) <= 127 && Short.parseShort(input) >= -128){
            return "byte";
        }else if (length <= 5 && Integer.parseInt(input) <= 32767 && Integer.parseInt(input) >= -32768){
            return "short";
        }else if(length <= 10 && Long.parseLong(input) <= 2147483647 && Long.parseLong(input) >= -2147483648){
            return "int";
        }else{
            return "long";
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution("12345");
        System.out.println(result);

    }

}
