package Single_LinkedList;



public class Practice {
	private ListNode head;
public static class ListNode{
	private int data;
	private ListNode next;
	public ListNode(int data) {
		this.data=data;
		this.next=null;
	}
	
}

//To Print the SLL------------------->
public void display() {
	ListNode current =head;
	while(current!=null) {
		System.out.print(current.data+"-->");
		current=current.next;
	}System.out.println("null");
		
	}


//To Find the Length of SLL----------->
public void length() {
	if(head==null) {
		System.out.println(0);;
	}
	int count=0;
	ListNode current=head;
	while(current!=null) {
		count++;
		current=current.next;
	}
	System.out.println(count);;
}


//To add the node at the First of SLL-------->
public void insertfirst(int value) {
	ListNode newNode=new ListNode(value);
	newNode.next=head;
	head=newNode;
}

//To add the node at the Last of SLL-------->
public void insertLast(int value) {
	ListNode newNode=new ListNode(value);
	if(head==null) {
		head=newNode;
		return;
	}
	ListNode current=head;
	while(null!=current.next) {
		current=current.next;
	}
	current.next=newNode;
	
}


public ListNode reverse() {
	if(head==null) {
		return head;
	}
	ListNode current =head;
	ListNode prev=null;
	ListNode temp=null;
	while(current!=null) {
		temp=current.next;
		current.next=prev;
		prev=current;
		current=temp;
	}
	return prev;
}

//To delete the First node in the SLL-------->

public ListNode deleteFirst() {
	if(head==null) {
		return null;
	}
	ListNode current=head;
	head=head.next;
	current.next=null;
	return current;
}

//To delete the Last node in the SLL-------->
public ListNode deleteLast() {
	if(head==null || head.next==null) {
		return head;
	}
	ListNode current=head;
	ListNode previous=head;
	while(current.next!=null) {
		previous=current;
		current=current.next;
	}
	previous.next=null;
	return current;
}

//To delete the node from a given Position in the SLL-------->

public void delete(int position) {
	if(position==1) {
		head=head.next;
		}else {
			ListNode previous=head;
			int count=1;
			while(count<position-1) {
				previous=previous.next;
				count++;
			}ListNode current=previous.next;
			previous.next=current.next;
		}
}

//To Search an element in the SLL-------->
public  boolean find(int value) {
	if(head==null) {
		return false;
	}
	ListNode current=head;
	while(current!=null) {
		if(current.data==value) {
			return true;
		}
		current=current.next;
	}return false;
}

public void remove() {
	if(head==null) {
		return;
	}
	ListNode current=head;
	while(current!=null & current.next!=null) {
		if(current.data==current.next.data) {
			current.next=current.next.next;
		}else {
		current=current.next;
	}
	}
}

public ListNode insertSortedList(int value) {
	ListNode newNode=new ListNode(value);
	if(head==null) {
	return newNode;
	}
	ListNode current=head;
	ListNode temp = null;
	while(current!=null && current.data<newNode.data) {
	temp=current;
	current=current.next;
	}
	newNode.next=current;
	temp.next=newNode;
	return head;
		
	}

//To Detect a Loop in the SLL-------->
public boolean ContainLoop() {
	ListNode fastPtr=head;
	ListNode slowPtr=head;
	while(fastPtr!=null&&fastPtr.next!=null) {
		fastPtr=fastPtr.next.next;
		slowPtr=slowPtr.next;
		if(slowPtr==fastPtr) {
			return true;
		}
	}
	return false;
}


public ListNode middle() {
	if(head==null) {
		return null;
	}
	ListNode slowptr=head;
	ListNode fastptr=head;
	while(fastptr!=null && fastptr.next!=null) {
		slowptr=slowptr.next;
		fastptr=fastptr.next.next;
	}
	return slowptr;
}


	public static void main(String[] args) {
		Practice sll=new Practice();
		sll.head=new ListNode(6);
		ListNode second=new ListNode(8);
		ListNode third=new ListNode(10);
		ListNode fourth=new ListNode(12);
		ListNode fifth=new ListNode(12);
		
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		
		
		sll.display();
//		ListNode rev = sll.reverse();
//		sll.display();
		
//		sll.length();
//		
//		sll.insertfirst(11);
//		sll.display();
//		
//		sll.insertLast(16);
//		sll.display();
//
//		System.out.println(sll.deleteFirst().data);
//		sll.display();
//	
//		System.out.println(sll.deleteLast().data);
//		sll.display();
//		
//		sll.delete(1);
//		sll.display();
//
//		if(sll.find(1)){
//			System.out.println("find");
//			
//		}else {
//			System.out.println("not find");
//		}
		
//		sll.remove();
//		sll.display();

//		sll.insertSortedList(9);
//		sll.display();
		
		
//		ListNode mdl= sll.middle();
//		System.out.println(mdl.data);
	}
}

