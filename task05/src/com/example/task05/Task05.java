package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        int len = 0;
        int count = 0;

        for(; x > 0; x/=10)
        {
            len += 1;
            if(x % 2 == 0)
                count += 1;
        }
        if(len == count)
            return "TRUE";
        else
            return "FALSE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        String result = solution(1234);
        System.out.println(result);
    }

}
