package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        try {
            byte res = Byte.parseByte(input);
            return "byte";
        }
        catch (Exception e) {
            try {
                short res = Short.parseShort(input);
                return "short";
            }
            catch (Exception ex) {
                try {
                    int res = Integer.parseInt(input);
                    return "int";
                }
                catch (Exception exep) {
                    try {
                        long res = Long.parseLong(input);
                        return "long";
                    }
                    catch (Exception exept) {
                        return "";
                    }
                }
            }
        }
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
