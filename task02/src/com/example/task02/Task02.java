package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        long var1 = Long.valueOf(input);
        if (Byte.MAX_VALUE >= var1 && Byte.MIN_VALUE <= var1) return "byte";
        if (Short.MAX_VALUE >= var1 && Short.MIN_VALUE <= var1) return "short";
        if (Integer.MAX_VALUE >= var1 && Integer.MIN_VALUE <= var1) return "int";
        if (Long.MAX_VALUE >= var1 && Long.MIN_VALUE <= var1) return "long";


         return "Error";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution("512");
        System.out.println(result);

    }

}
