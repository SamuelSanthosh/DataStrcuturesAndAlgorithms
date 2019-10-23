/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DoublyLinkedList
{
    Node head;
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            data = d;
            next = null;
            prev = null;
            //Constructor
        }
    }
    // head <--> 4 <--> 5 <--> 6 // <- 7 ->
    public void insert(int x){
        Node new_node = new Node(x); 
        new_node.next = head;
        new_node.prev = null;
        if(head != null)
            head.prev = new_node;
        head = new_node;
    }
    public int search(int x){
        int index = 0;
        Node temp = head;
        while(temp.data != x){
            index++;
            temp = temp.next;
            if(temp == null){
                return null;
            }
        }
        return index;
    }
    public void delete(int index){
        Node prev_node = head;
        for(int i=0;i < index-1;i++){
            prev_node = prev_node.next;
        }    
            Node after = prev_node.next.next;
            Node del = prev.next;
            prev_node.next = after;
            after.prev = prev;
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.push(12);
		dll.push(23);
		dll.push(34);
		dll.push(45);
	}
}
