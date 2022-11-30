package StackDS;

public class Reverse {
	public ListNode head;
	private ListNode top;
	private int length;
	
private class ListNode {
	private int data;
	private ListNode next;
			
public ListNode(int data) {
	this.data=data;
	next=null;
			}
			}
public int length() {
	return length;
			}

public boolean isEmpty() {
	return head==null;
			}
public void push(char c) {
	ListNode newnode=new ListNode(c);
		if(isEmpty()) {
			head=newnode;
		}
		newnode.next=head;
		head=newnode;
		length++;
		}
	

public char pop() {
	if(isEmpty()) {
	
	}
	char top=(char) head.data;
	head=head.next;
	length--;
	return top;
}


public int peek() {
	if(isEmpty()) {
		return -1;
	}
	return head.data;
}


public static String reverse(String str) {
	Reverse reverse = new Reverse();
	char[] chars=str.toCharArray();
	
	for(char c: chars) {
		reverse.push(c);
	}
	for(int i=0;i<str.length();i++) {
		chars[i]= reverse.pop();
		
	}return new String(chars);
}
	

	public static void main(String[] args) {
		Reverse st=new Reverse();
		String str="krish";
		System.out.println(st.reverse(str));
		
	}

}
