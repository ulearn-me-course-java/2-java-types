package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int aSum = Math.abs(x + y);
        if (aSum < 100000) {
            if (aSum < 100) {
                if (aSum < 10) {
                    return 1;
                } else {
                    return 2;
                }
            } else {
                if (aSum < 1000) {
                    return 3;
                } else {
                    if (aSum < 10000) {
                        return 4;
                    } else {
                        return 5;
                    }
                }
            }
        } else {
            if (aSum < 10000000) {
                if (aSum < 1000000) {
                    return 6;
                } else {
                    return 7;
                }
            } else {
                if (aSum < 100000000) {
                    return 8;
                } else {
                    if (aSum < 1000000000) {
                        return 9;
                    } else {
                        return 10;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(12, 34);
        System.out.println(result);
        */
    }

}
