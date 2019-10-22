/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
// -2,- 3,4,-1,-2,5,6
// best case 
// -2,-3,4,-1,-2,5,6
//Moving the array and adding at the same time
//sum: -2,-5,1,-2,-4,1,7
// If value is negative make it zero or add 
// 0,0,4,3,1,6,12
// 
class MaxSubarray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] a ={-2,-3,-4,-1,-2,-5,-6};//-1000000
		int n = a.length;
		int res_result = Integer.MIN_VALUE;//-1000000
		int sum=0;
		/*
		 ----------WORST CASE SCENARIO-----------
		for(int i=0;i<n;i++){  //n
		    int sum=0;
		    for(int j=i;j<n;j++){  //n
		        sum=0;
		        for(int k=i;k<=j;k++){  //n  
		            sum+=a[k];
		        }
		        if(sum>res_result)
		            res_result = sum;
		    }
		}
		System.out.println("The Max Value is:"+res_result);*/
		for(int i=0;i<n;i++) // o(n)
		{
		    sum += a[i];
		    if(sum>res_result)
		     res_result = sum;
		    if(sum<0)
		        sum = 0;
		}
		System.out.println("The Max Value is:"+res_result);
	}
	
}
