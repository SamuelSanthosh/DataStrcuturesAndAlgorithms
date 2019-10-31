/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    /*boolean isPal(String s){
        int a = s.length();
        int i = 0;
        int j = n-1;
        for(i = 0;i < n;i++){
            if(s[i] != s[j]){
                return false;
            }
            j--;
        }
        return true;
    }   */ 
    boolean isPalRec(String[] s,int start,int end){// O(N)
        if(start > end)
            return true;
        else {
            if(s[start] != s[end])
                return false;
            return isPalRec(s,start+1,end-1);    
        }    
    }
	public static void main (String[] args)
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine();
	//	System.out.println(isPal(str));
		System.out.println(isPalRec(str,0,str.length));
	}
}
