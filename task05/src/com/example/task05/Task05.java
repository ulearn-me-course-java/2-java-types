package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        int xLength = 0;
        int evenCount = 0;
        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        for (;x>0;x/=10) {
            xLength++;
            if (x%2 == 0)
                evenCount++;
        }
        if (xLength != evenCount) return "FALSE";
        return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution(264);
        System.out.println(result);

    }

}
