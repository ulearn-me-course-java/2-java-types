package com.example.task14;

public class Task14 {


    public static int reverse(int value) throws NumberFormatException {
        try {
            StringBuilder sB = new StringBuilder(new Integer(value).toString());
            sB = sB.reverse();

            return Integer.parseInt(sB.toString());
        } catch(NumberFormatException ex) {
            System.out.println(ex + " - exception caught!");
            return 0;
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = reverse(345);
        System.out.println(result);
         */
    }


}
