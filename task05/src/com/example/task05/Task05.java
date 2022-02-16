package com.example.task05;

public class Task05 {

    public static boolean solution(int x) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        boolean isTrue;
        if((x >= 0 && x <= 99999) && x % 2 == 0)
        {
            isTrue = true;
        }
        else
        {
            isTrue = false;
        }

        return isTrue;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
      
        boolean result = solution(1234);
        System.out.println(result);
        
    }

}
