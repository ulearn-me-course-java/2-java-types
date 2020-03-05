package com.example.task14;

public class Task14 {


  public static int reverse(int value) {
    String valueStr = Integer.toString(value);
    String reversStr = new StringBuilder(valueStr).reverse().toString();
    return Integer.parseInt(reversStr);
  }

  public static void main(String[] args) {
    // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
    // например вот так:
        /*
        int result = reverse(345);
        System.out.println(result);
         */
  }


}
