package com.example.task02;

public class Task02 {

  public static String solution(String input) {
    long inputNum = Long.parseLong(input);
    if (Byte.MIN_VALUE <= inputNum && Byte.MAX_VALUE >= inputNum) return "byte";
    else if (Short.MIN_VALUE <= inputNum && Short.MAX_VALUE >= inputNum) return "short";
    else if (Integer.MIN_VALUE <= inputNum && Integer.MAX_VALUE >= inputNum) return "int";
    else return "long";
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
