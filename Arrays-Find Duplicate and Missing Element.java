/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// 1,2,3,4,5,6,7,7 -> find duplicate and missing Element 
/* Name of the class has to be "Main" only if the class is public. */
class Array
{
    static void printElement(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j] && i != j) {
                    System.out.println("This value comes twice:"+arr[i]);
                }
            }
        }
        int flag=0;
        for(int i=1;i <= n;i++){
            flag=0;
            for(int j=0;j < n;j++){
                if(i != arr[j]){
                    //
                }
                else{
                    flag=1;
                }
            }   
            if(flag == 0){
                System.out.println("The value does not come:"+i);
            }
        }
        
    }   
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int  arr[]= {1,2,3,4,5,6,7,7};
		int arr_size = arr.length; 
		printElement(arr,arr_size);
		System.out.println("qwerty");
	}
}
