package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
            int value = Integer.parseInt(input);
            if(value < 128 && value>= -128) {
                return "Byte";
            } else if ((value >= -32768 && value < -128) || (value >= 128 && value < 32767)) {
                return "Short";
            } else if ((value >= -2147483648 && value < -32768) || (value >= 32767 && value < 2147483647)) {
                return "Int";
            } else {
                return "Long";
            }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution("-512");
        System.out.println(result);

    }

}
