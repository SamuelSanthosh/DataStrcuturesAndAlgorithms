/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LinkedList
{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    void printNthElement(int n) 
    { 
        int len = 0; 
        Node temp = head; 
        while (temp != null) { 
            temp = temp.next; 
            len++; 
        } 
        if (len < n) 
            return;
        temp = head;
        for (int i = 1; i < len - n + 1; i++) 
            temp = temp.next; 
        System.out.println("The element at index "+n+"is:"+temp.data); 
    } 
    public void push(int new_data){
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
        //System.out.println(head.data);
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		LinkedList list = new LinkedList();
		list.push(34);
		list.push(45);
		list.push(3);
		list.push(5);
		list.push(7);
		list.push(54);
		list.push(345);
		
		list.printNthElement(7);
	}
}
