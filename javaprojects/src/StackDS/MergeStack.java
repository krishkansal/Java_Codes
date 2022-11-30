package StackDS;



public class MergeStack {
	private ListNode head;
	private ListNode tail;
	
	
private class ListNode {
	private int data;
	private ListNode next;
	private ListNode previous;
		
public ListNode(int data) {
		this.data=data;
		
	}
}
public MergeStack() {
	this.head=null;
	this.tail=null;
}

public void puch(int value) {
	ListNode newnode=new ListNode(value);
	if(head==null) {
		head=newnode;
		head.next=null;
		head.previous=null;
		tail=newnode;
		
	}else {
		newnode.previous=tail;
		tail.next=newnode;
		tail=newnode;
	}
}

public void pop() {
	if(head==null) {
		System.out.println("Stack Overflow");
	}else if(head==tail) {
		head=null;
		tail=null;
	}else {
		ListNode n=tail;
		n=tail.previous;
		n.next=null;
	}
}


public void display() {
	if(tail==null) {
		return;
	}
	ListNode temp=tail;
	while(temp!=null) {
		System.out.print(temp.data+"-->");
		temp=temp.previous;
	}System.out.println("null");
	
}
public void merge(MergeStack s)
{
    head.previous = s.tail;
    s.tail.next = head;
    head = s.head;
    s.tail = null;
    s.head = null;
}


public static void main(String[] args) {
		MergeStack ms1=new MergeStack();
		MergeStack ms2=new MergeStack();
		ms1.puch(6);
	    ms1.puch(5);
	    ms1.puch(4);
	    ms2.puch(9);
	    ms2.puch(8);
	    ms2.puch(7);
	     ms1.merge(ms2);
	     ms1.display();
	}

}
