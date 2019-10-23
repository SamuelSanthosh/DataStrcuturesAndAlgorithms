/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Stack 
{
    int max_item = 5;
    int a[] = new int[max_item];
    int top;
    
    Stack(){
        top = -1;
    }
    
    boolean isEmpty(){
        if(top < 0)
            return true;
        return false;    
    }
    public void push(int x){
        if(top >= (max_item-1)){
            System.out.println("Stack Overflow");
        }
        else{
            a[++top] = x;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            return -1;
        }        
        else{
            return a[top--];
        
        }    
    }
    public int peek(){
        if(top < 0){
            System.out.println("Stack Empty");
            return -1;
        }
        else{
            return a[top];
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Stack s = new Stack();
		s.push(5);
		s.push(15);
		s.push(25);
		int x = s.pop();
		int y = s.peek();
		System.out.println("pop:"+x);
		System.out.println("push:"+y);
	}
}
