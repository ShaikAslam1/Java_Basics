package com.ismail;

import java.util.*;
class GeometricProgression {
    public static void main (String[] args) {

        //taking input using Scanner class
        Scanner sc=new Scanner(System.in);

        //taking total testcases
        int T=sc.nextInt();
        while(T-->0)
        {

            Solution  obj=new Solution ();
            int A,B;

            //taking A and B
            A=sc.nextInt();
            B=sc.nextInt();
            int N;

            //taking N
            N=sc.nextInt();

            //calling method termOfGP() of class GP
            System.out.println((int)Math.floor(obj.termOfGP(A,B,N)));

        }

    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{

    public double termOfGP(int A,int B,int N)
    {
        //Your code here
        double commonRation = (double)B/(double)A;

        if (N == 1)
            return (double) A;
        else
            return A * Math.pow(commonRation, N-1);

    }

}
