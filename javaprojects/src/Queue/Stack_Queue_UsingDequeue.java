package Queue;

public class Stack_Queue_UsingDequeue {

	private ListNode head;
	private ListNode tail;
	private int length;

private class ListNode {
	private int data;
	private ListNode next;
	private ListNode previous;

public ListNode(int data) {
	this.data=data;
}
}

public Stack_Queue_UsingDequeue() {
this.head=null;
this.tail=null;
this.length=0;
}
public boolean isEmpty() {
return length==0;
}
public int length() {
return length;
}
	
public void insert_first(int value) {
	ListNode newNode=new ListNode(value);
	if(isEmpty()) {
		tail=newNode;
	}else {
		head.previous=newNode;
		newNode.next=head;
	}
		head=newNode;
		length++;	
}
public void insert_Last(int value) {
	ListNode newNode=new ListNode(value);
	if(isEmpty()) {
		head=newNode;
	}else {
		tail.next=newNode;
	}
	newNode.previous=tail;
	tail=newNode;
	length++;
}

public void  remove_first() {
	if(isEmpty()) {
		return;
	}
	ListNode temp=head;
	if(head==tail) {
		tail=null;
	}else {
		head.next.previous=null;
		head=head.next;
	}
	temp.next=null;
	length--;
	return ;
}

public void remove_last() {
	if(isEmpty()) {
		return;
	}
	ListNode temp=tail;
	if(head==tail) {
		head=null;
	}else {
		tail.previous.next=null;
		tail=tail.previous;
	}
	temp.previous=null;
	length--;
	return ;
}

public void display() {
	if(head==null) {
		return;
	}
	ListNode temp=head;
	while(temp!=null) {
		System.out.print(temp.data+"-->");
		temp=temp.next;
	}System.out.println("null");
	
}

public static class Stack{
	Stack_Queue_UsingDequeue d = new Stack_Queue_UsingDequeue();
	public void push(int value) {
			d.insert_Last(value);
	}
		
			public int length() {
				return d.length();
			}
	public void pop() {
		d.remove_last();
	}
	
	public void display() {
		d.display();
	}
		
}


public static class Queue{
	Stack_Queue_UsingDequeue d = new Stack_Queue_UsingDequeue();
	
	public void enqueue(int value) {
		d.insert_Last(value);
	}
	public void dequeue() {
		d.remove_first();
	}
	public void display() {
		d.display();
	}
	public int length() {
		return d.length();
	}
	
}

	public static void main(String[] args) {
		
		Stack stk=new Stack();
		stk.push(7);
		stk.push(8);
		System.out.print("Stack: ");
		stk.display();
		System.out.println();
		
		stk.pop();
		System.out.print("Stack: ");
		stk.display();
		System.out.println();
		
		Queue que= new Queue();
		que.enqueue(12);
		que.enqueue(13);
		System.out.print("Queue: ");
		que.display();
		System.out.println();
		que.dequeue();
		System.out.print("Queue: ");
		que.display();
		System.out.println();
		
		System.out.println("Size of the Stack is "+ stk.length());
		System.out.println("Size of the Queue is "+ que.length());
		
		
		
	}

}
