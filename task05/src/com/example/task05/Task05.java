package com.example.task05;
import java.util.Arrays;
public class Task05 {

    public static String solution(int x) {

        String number = Integer.toString(x);
        char[] charArray = number.toCharArray();
        int[] intArray = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = Character.getNumericValue(charArray[i]);
            if (intArray[i] % 2 != 0){
                return "FALSE";
            }
        }
        return "TRUE";
    }

    public static void main(String[] args) {

        String result = solution(1234);
        System.out.println(result);
    }

}
