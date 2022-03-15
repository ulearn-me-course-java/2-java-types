package com.example.task06;

public class Task06 {

    public static int solution(int x, int y)
    {
        int sum = Math.abs(x + y);
        if(sum == 0)
            return 1;

        int res = 0;
        while(sum > 0)
        {
            sum /= 10;
            res ++;
        }

        return res;
    }

    public static void main(String[] args)
    {
        System.out.print(solution(-5512,-35046));
    }

}
