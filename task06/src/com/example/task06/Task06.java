package com.example.task06;

public class Task06
{

    public static int solution(int x, int y)
    {
        int results = x + y;
        int cnt = 0;
        String lengthrez = Integer.toString(results);

        for (int i = 0; i<lengthrez.length(); i++)
        {
            if (!(lengthrez.charAt(i)=='-'))
            {
                cnt+=1;
            }
        }

        return cnt;
    }

    public static void main(String[] args)
    {
        int result = solution(120, 34);
        System.out.println(result);
    }

}
