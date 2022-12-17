package StackDS;

public class Stacks {
	public Node head;
	private Node top;
	private int length;
	
		private class Node {
			private int data;
			private Node next;
	
public Node(int data) {
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


						// implement puch() , pop() , peek()

public void push(int data) {
	Node newnode=new Node(data);
	if(isEmpty()) {
		head=newnode;
	}
	newnode.next=head;
	head=newnode;
	length++;
	System.out.print(head.data+"-->");
}

public int pop() {
	if(isEmpty()) {
		return -1;
	}
	int top=head.data;
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


public Node middle() {
	if(isEmpty()) {
		return null;
	}
	Node slowptr=head;
	Node fastptr=head;
	while(fastptr!=null && fastptr.next!=null) {
		slowptr=slowptr.next;
		fastptr=fastptr.next.next;
	}
	return slowptr;
}

//public static String reverse(String str) {
//	Stack Stack=new Stack();
//	char[] Chars=str.toCharArray();
//	for(char c:Chars) {
//		Stack.push(c);
//	}
//	for(int i=0;i<str.length();i++) {
//		Chars[i]=(char) Stack.pop();
//	}
//	return new String(Chars);
//}


//public static String Reverse(String str) {
//	Stack<Character> Stack = new Stack<>();
//	Char[] Chars=str.toCharArray();
//	for(Char c:chars) {
//		Stack.puch(c);
//	}
//	for(int i=0;i<str.length();i++) {
//		Chars[i]=Stack.pop();
//	}
//}
	public static void main(String[] args) {
		Stacks st=new Stacks();
		st.push(10);
		st.push(15);
		st.push(20);
		st.push(25);
		
//		Stacks st1=new Stacks();
//		st1.push(100);
//		st1.push(150);
//		st1.push(200);
//		st1.push(250);
		
	System.out.println();
	System.out.println(st.pop());
	System.out.println(st.peek());	
	
	Node mdl = st.middle();
		System.out.println(mdl.data);
		System.out.println(st.middle().data);
		
//		System.out.println("peek of 1st : " +st.peek());
//		st.pop();
//		System.out.println("peek 1st : " +st.peek());
//		System.out.println("length of 1st : "+st.length());
//		//System.out.println(reverse("ABCD"));
//		System.out.println();
//		System.out.println("peek of 2nd : " +st1.peek());
//		st1.pop();
//		System.out.println("peek 2nd : " +st1.peek());
//		System.out.println("length of 2nd : "+st1.length());
	}

}
