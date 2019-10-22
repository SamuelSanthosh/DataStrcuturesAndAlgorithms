/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int maxSum(int arr[],int N){
        int max_so_far = arr[0];
        int curr_max = arr[0];
        for(int i=1;i<N;i++){
            curr_max = Integer.max(arr[i],curr_max+arr[i]);
            max_so_far = Integer.max(max_so_far,curr_max);
                
        }
        return max_so_far;
    }
	public static void main (String[] args) {
		//code
		Scanner S  = new Scanner(System.in);
		int T = S.nextInt();int N;
		while(T-- > 0){
		    N = S.nextInt();
		    int arr[] = new int[N];
		    for(int j=0;j<N;j++){
		        arr[j] = S.nextInt();
		    }
		    int max = maxSum(arr,N);
		    System.out.println(max);
		}
	}
}
