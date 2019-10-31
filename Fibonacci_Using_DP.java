/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int fib_dp(int n){
        int fib[] = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2;i <= n;i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n-1];
        
    }
    /*Space complexity is not taken into account 
    int a = 0,b = 1,c;
    for(int i = 2;i <= n;i++){
        c = a + b;
        a = b;
        b = c;
    }*/
    
	public static void main (String[] args)
	{
		// your code goes here
		int n = 5;
		System.out.println(fib_dp(n));
	}
}
