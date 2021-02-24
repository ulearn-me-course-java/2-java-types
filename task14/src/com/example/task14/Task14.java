package com.example.task14;


public class Task14 {


    public static int reverse(int value) {

        // TODO напишите здесь код, переставляющий цифры числа в обратном порядке
        StringBuilder strbil = new StringBuilder(String.valueOf(value));
        strbil.reverse();
        for (int i = 1; i <= strbil.length();i++){
            if(!strbil.toString().isEmpty()){
                return Integer.parseInt(strbil.toString());
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = reverse(345);
        System.out.println(result);

    }


}
