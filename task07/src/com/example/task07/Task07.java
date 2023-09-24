package com.example.task07;

public class Task07 {
    public static int Func(int num, int divr){
        int count = 0;
        while (num > divr){
            num -= divr;
            count += 1;
        }
        return count * divr;
    }

    public static int solution(int n, int m, int k) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        int sOfCamp = Func(n, k) * Func(m, k);
        int result = sOfCamp / (k * k);
        return result;
    }

    public static void main(String[] args) {

        int result = solution(20, 50, 3);
        System.out.println(result);

    }

}
