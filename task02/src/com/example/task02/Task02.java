package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        Long inputNamber = Long.parseLong(input);

        if (inputNamber >= -128 && inputNamber <= 127) {
            return "Byte";
        }
            else if (inputNamber >= - Math.pow(2,15) && inputNamber <= Math.pow(2,15)-1) {
                return "Short";
            }
            else if (inputNamber >= -Math.pow(2,31) && inputNamber <= Math.pow(2,31)-1) {
                return "Int";
            }
            return "Long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution("12345");
        System.out.println(result);
    }
}
