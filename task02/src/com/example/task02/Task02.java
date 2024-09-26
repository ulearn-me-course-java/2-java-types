package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        try {
            long number = Long.parseLong(input);
            if( number <= Byte.MAX_VALUE && number >= Byte.MIN_VALUE) {
                return "Byte";
            }
            else if (number <= Short.MAX_VALUE && number >= Short.MIN_VALUE) {
                return "Short";
            }
            else if (number <= Integer.MAX_VALUE && number >= Integer.MIN_VALUE) {
                return "Integer";
            }
            else if (number <= Long.MAX_VALUE && number >= Long.MIN_VALUE) {
                return "Long";
            }
        }
        catch ( Exception ex) {
            System.out.println("Ошибка при вводе. Введите число.");
        }
        return "";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution("ssds");
        System.out.println(result);

    }

}
