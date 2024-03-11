package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        for (int i = 1; i <= x; i++){
            int num = x % 10;
            if(num % 2 != 0){
                return "FALSE";
            }
            else if (num == 0) {
                return "FALSE";
            }
            x /= 10;
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        String result = solution(10);
        System.out.println(result);
    }

}
