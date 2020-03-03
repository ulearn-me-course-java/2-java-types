package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        String a = Integer.toString(x);
       if(a.indexOf('1') != -1 || a.indexOf('3') != -1 || a.indexOf('5') != -1 || a.indexOf('7') != -1  || a.indexOf('9') != -1 )
        return "FALSE";
       else return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution(1234);
        System.out.println(result);
        */
    }

}
