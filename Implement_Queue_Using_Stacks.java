/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static class Queue  
{  
    static Stack<Integer> s1 = new Stack<Integer>();  
    static Stack<Integer> s2 = new Stack<Integer>();  
  
    static void enQueue(int x)  
    {  
        while (!s1.isEmpty()) 
        {  
            s2.push(s1.pop());  
        }  
  
        s1.push(x);  
  
        while (!s2.isEmpty())  
        {  
            s1.push(s2.pop());  
        }  
    }  
  
    static int deQueue()  
    {  
        if (s1.isEmpty())  
        {  
            System.out.println("Q is Empty");  
            System.exit(0);  
        }  
 
        int x = s1.peek();  
        s1.pop();  
        return x;  
    }  
};  
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Queue q = new Queue();  
        q.enQueue(13);  
        q.enQueue(12);  
        q.enQueue(34);  
      
        System.out.println(q.deQueue());  
        System.out.println(q.deQueue()); 
	}
}
