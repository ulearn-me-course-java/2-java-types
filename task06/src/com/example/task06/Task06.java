package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        int lenghOfStr;
        int sum = x + y;
        String str = String.valueOf(sum);
        lenghOfStr = str.length();
        return lenghOfStr;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        
        int result = solution(12, 34);
        System.out.println(result);
       
    }

}
