package com.example.task07;

public class Task07
{
    public static int solution(int n, int m, int k)
    {
        int cntTents = 0;
        int cntWidth, cntLength = 0; // количество полных палаток которые могут поместиться в ширину и длину

        cntWidth = n/k;
        cntLength = m/k;
        cntTents = cntWidth*cntLength;

        return cntTents;
    }

    public static void main(String[] args)
    {
        int result = solution(10, 20, 5);
        System.out.println(result);
    }
}
