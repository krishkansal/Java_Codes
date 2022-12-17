package StackDS;

import java.util.Scanner;

class stack{
	Scanner sc=new Scanner(System.in);
	int top=-1;
	int n=10;
	int a[]=new int[n];
	
	void push(int data) {
		if(top==n-1) {
			System.out.println("overflow");
		}else {
			//System.out.println("enter data");
			//int i=sc.nextInt();
			top=top+1;
			a[top]=data;
			System.out.println("item inserted");
		}
	}
	
	void pop() {
		if(top==-1) {
			System.out.println("underflow");
		}else {
			top=top-1;
			System.out.println();
			System.out.println("item deleted");
		}
	}
	
	void display() {
		System.out.println("items are: ");
		for(int j=top;j>=0;j--) {
			System.out.print(a[j]+" ");
		}
	}
}

public class StackUsingArray {

	public static void main(String[] args) {
		
		stack s =  new stack();
		
		s.push(5);
		s.push(10);
		s.display();
		s.pop();
		s.display();                  
		
	}

}
