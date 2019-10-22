/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LinkedList
{
    Node head; 
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void push(int new_data){
        // create a new node
        Node new_Node = new Node(new_data);
        // point next of new_Node to head
        new_Node.next = head;
        // head to new_Node
        head = new_Node;
        //System.out.println(head.data);
    }
    public void findNthElement(int n){
        Node current = head;
        int temp = 0;
        while(current != null){
            if(temp == n){
                System.out.println("The Nth value is"+current.data);
            }
            temp++;
            current = current.next;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		LinkedList list = new LinkedList();
		list.push(12);
		list.push(23);
		list.push(34);
		list.push(45);
		list.push(6);
		System.out.println(list.head.data);
	    list.findNthElement(3);
	}
}
