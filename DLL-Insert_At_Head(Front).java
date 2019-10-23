/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DLL
{
    Node head;
  
    class Node { 
        int data; 
        Node prev; 
        Node next; 
        Node(int d) { 
            data = d; 
        } 
    } 
    
    public void push(int new_data) 
    { 
        Node new_Node = new Node(new_data); 
  
        new_Node.next = head; 
        new_Node.prev = null; 
  
        if (head != null) 
            head.prev = new_Node; 
  
        head = new_Node; 
        System.out.print(head.data+" ");
    } 
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		DLL dll = new DLL();
		//System.out.println("Head:"+dll.head.data);
		dll.push(12);
		dll.push(23);
		dll.push(34);
		dll.push(45);
		System.out.println("Head:"+dll.head.data);
		
	}
}
