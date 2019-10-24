/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static class Queue{
        int front = rear = 0;
        int max_size = 100;
        char a[] = new char[max_size];
        
        void enqueue(char x){
            if(rear == max_size){
                System.out.println("QUEUE FULL");
            }
            else{
                a[++rear] = x;
            }
        }
        
        char dequeue(){
            if(rear == front){
                System.out.println("QUEUE EMPTY");
                return '\0';
            }
            else{
                char res = a[front];
                for(int i = 0; i< rear; i++){
                    a[i] = a[i+1];
                }
                if(rear < max_size)// after swap both a[i-1] and a[i] are same ,so make a[i-1] = 0
                    a[rear - 1] = '\0';//Override the elements  so,not needed
                rear -= 1;    
            }
            return res;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	}
}
