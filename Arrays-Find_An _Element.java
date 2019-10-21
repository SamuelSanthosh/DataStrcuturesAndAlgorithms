/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Array
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[]={12,23,45,23,23,13,34,1,2,3,4,5};
		int n = arr.length;
		int k=1;
		for(int i=0;i<n;i++)
		{
		    if(arr[i]==k)
		        System.out.println("Number found at pos:"+i);
		}
	}
}
