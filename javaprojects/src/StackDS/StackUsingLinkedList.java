package StackDS;

class Stack1{
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node top=null;
	public void push(int value) {
		Node newnode=new Node(value);
		if(top==null) {
			top=newnode;
		}else {
			newnode.next=top;
			top=newnode;
		}
	}
	
	public void pop() {
		if(top==null) {
			System.out.println("Stack is Empty");
		}else {
			top=top.next;
		}
	}
	
	public void display() {
		Node temp=top;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;  
		}
	}
	public void peek() {
		if(top==null) {
			
		}else {
			System.out.println("peek element:"+top.data);
		}
	}
}

public class StackUsingLinkedList {

	public static void main(String[] args) {
		Stack1 s1=new Stack1();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.pop();
		s1.display();
		s1.peek();
	}

}
