package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

       int summ = x + y;
       int count = 0;
       while (summ != 0) {
           summ /= 10;
           count +=1;
       }
        return count;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(12, 105);
        System.out.println(result);

    }

}
