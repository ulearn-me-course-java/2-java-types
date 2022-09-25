package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {
        int square = n*m;
        int kempSquare = k*k;
        int quantity = 0;
        while (square>=kempSquare){
            square-= kempSquare;
            quantity++;

        }



        return quantity;
    }

    public static void main(String[] args) {

        int result = solution(16, 20, 9);
        System.out.println(result);

    }

}
