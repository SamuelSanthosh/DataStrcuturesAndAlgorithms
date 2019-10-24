/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// If open bracket - push into stack
// If close bracket - pop into stack

/* Name of the class has to be "Main" only if the class is public. */
class Balance
{
    static class Stack{
        int top = -1;
        int max_size = 100;
        char a[] = new char[max_size];
        void push(char x){
            if(top >= max_size - 1){
                System.out.println("STACK FULL");
            }
            else {
                a[++top] = x;
            }
        }
        char pop(){
            if(top < 0){
                System.out.println("STACK EMPTY");
                return '\0';
            }
            else{
                return a[top--];
            }
        }
    }
    static boolean matching(char open,char close){
        if(open == '(' && close == ')')
        {
            return true;
        }
        else if(open == '{' && close == '}')
        {
            return true;
        }
        else if(open == '[' && close == ']')
        {
            return true;
        }
        else
            return false;
    }        
    static boolean areBalanced(char a[]){
        Stack stack = new Stack();
        for(int i=0;i<a.length;i++){
            if(a[i]=='('||a[i]=='{'||a[i]=='[')
                stack.push(a[i]);
                
            if(a[i]==')'||a[i]=='}'||a[i]==']'){
                if(stack.top < 0){
                    return false;
                }
                char temp = stack.pop();
                if(!matching(temp,a[i])){
                    return false;
                }
            }    
        }
        if(stack.top >= 0){
            return false;
        }
        return true;
    }
	public static void main (String[] args)
	{
		// your code goes here
		char a[]={')','('};
		Balance obj = new Balance();
		System.out.println("Is the expression balanced:"+obj.areBalanced(a));
	}
}
