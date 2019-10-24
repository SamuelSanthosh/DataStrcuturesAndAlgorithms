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
        Node prev;
        Node next;
        Node(int d){
            data = d;
            prev = null;
            next = null;
        }
    }
    void insert(int x){ //Insert at End DLL
        Node new_Node = new Node(x);
        if(head == null){
            head = new_Node; 
        }
        else{
            Node temp = head;
            while(temp.next ! =null){
                temp = temp.next;
            }
            temp.next = new_Node;
            new_Node.prev = temp;
            new_Node.next = null;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	}
}
