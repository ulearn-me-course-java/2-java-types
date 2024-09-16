package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        long a = Long.parseLong(input);

        if (a != (int)a)
            return "long";
        else if (a != (short)a)
            return  "int";
        else  if (a != (byte)a)
            return  "short";
        else
            return "byte";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution("12345");
        System.out.println(result);
    }

}
