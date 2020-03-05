package com.example.task06;

public class Task06 {

  public static int solution(int x, int y) {
    int result = 0;
    int z = x + y;
    if (z == 0) {
      result = 1;
      return result;
    }
    while (z != 0) {
      result++;
      z /= 10;
    }
    return result;
  }

  public static void main(String[] args) {
    // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
    // например вот так:
        /*
        int result = solution(12, 34);
        System.out.println(result);
        */
  }

}
