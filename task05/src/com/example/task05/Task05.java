package com.example.task05;
public class Task05 {
    public static String solution(int x) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        for (int i = 0;i<5;i++){
            if ((x%10)%2==1){
                return "FALSE";
            }
            x/=10;
        }

        return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution(88888);
        System.out.println(result);
    }

}
