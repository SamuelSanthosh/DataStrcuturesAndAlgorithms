/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LinkedList
{
    static class Node{
        int data;
        Node next;
    };
    static Node push(Node head_ref,int new_data){
        Node new_node = new Node(); 
        new_node.data = new_data; 
        new_node.next = (head_ref); 
        (head_ref) = new_node; 
        return head_ref; 
    }
    static Node removeFirstNode(Node head) 
    { 
        if (head == null) 
            return null; 
  
        Node temp = head; 
        head = head.next; 
  
        return head; 
    } 
	public static void main (String[] args)
	{
		// your code goes here
		Node head = null;
		
		head = push(head, 12); 
        head = push(head, 29); 
        head = push(head, 11); 
        head = push(head, 23); 
        head = push(head, 8); 
        
        System.out.println("Before Insertion");
        
        for (Node temp = head; temp != null; temp = temp.next) 
            System.out.print(temp.data + " ");
        System.out.println("\n"+"After Insertion");
        
        head = removeFirstNode(head); 
        for (Node temp = head; temp != null; temp = temp.next) 
            System.out.print(temp.data + " "); 
	}
}
