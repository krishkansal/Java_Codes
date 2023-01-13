package Double_Linked_List;


public class Doubly_LinkedList {
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

public Doubly_LinkedList() {
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


public void insertLast(int value) {
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


//To add the node at the First of dLL-------->
public void insertnode(int value) {
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


//To delete the node at the First of dll-------->
public ListNode deletefirst() {
	if(isEmpty()) {
		return null;
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
	return temp;
}


//To delete the node at the last of dll-------->
public ListNode deletelast() {
	if(isEmpty()) {
		throw new NoSuchElementException();
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
	return temp;
}



//To print in forward direction-------->
public void displayforward() {
	if(head==null) {
		return;
	}
	ListNode temp=head;
	while(temp!=null) {
		System.out.print(temp.data+"-->");
		temp=temp.next;
	}System.out.println("null");
	
}


//To print in backward direction-------->
public void displaybackward() {
	if(tail==null) {
		return;
	}
	ListNode temp=tail;
	while(temp!=null) {
		System.out.print(temp.data+"-->");
		temp=temp.previous;
	}
	System.out.println("null");
}



public void Reverse() {
	ListNode current=head;
	ListNode temp=null;
	while(current!=null) {
		temp=current.previous;
		current.previous=current.next;
		current.next=temp;
		current=current.previous;
	}
	if(temp!=null);
	head=temp.previous;
}




//public void Getnth(int index) {
//ListNode current=head;
//ListNode temp=tail;
//int count=1;
//while(current!=null && temp!=null) {
//	if(count==index) {
//		System.out.println(current.data);
//		System.out.println(temp.data);
//	}
//	count++;
//	current=current.next;
//	temp=temp.previous;
//}
//}



//public ListNode SwapKthelement(int n,int k) {
//	if(k>n) {
//		return head;
//	}
//	if(k==(n-k+1)) {
//		return head;
//	}
//	
//	
//	
//	 ListNode x = head;
//     ListNode x_prev = null;
//     for (int i = 1; i < k; i++) {
//         x_prev = x;
//         x = x.next;
//     }
//
//   
//     ListNode y = head;
//     ListNode y_prev = null;
//     for (int i = 1; i < n - k + 1; i++) {
//         y_prev = y;
//         y = y.next;
//     }
//
//     
//     if (x_prev != null)
//         x_prev.next = y;
//
//     
//     if (y_prev != null)
//         y_prev.next = x;
//
//    
//     ListNode temp = x.next;
//     x.next = y.next;
//     y.next = temp;
//
//    
//     if (k == 1)
//         head = y;
//
//     if (k == n)
//         head = x;
// 
//	return head;
//}



//public void Pairsum(int x) {
//	ListNode first=head;
//	ListNode second=head;
//	boolean found = false;
//	while(second.next!=null) {
//		second=second.next;
//		
//		
//	}
//	
//	while(first!=second && second.next!=first) {
//		if((first.data+second.data)==x) {
//			 found = true;
//			 System.out.println( "(" + first.data + ","+ second.data + ")" );
//			first=first.next;
//			second=second.previous;
//		}
//		else if((first.data+second.data)<x) {
//			first=first.next;
//		}else {
//			second=second.previous;
//		}
//	}
//	if(found==false) {
//	System.out.println("Not found");
//	}
//}



//public void insertinsorted(int value) {
//	ListNode newnode=new ListNode(value);
//	if(head==null) {
//		head=newnode;
//	}
//	else if(head.data>=newnode.data) {
//		newnode.next=head;
//		newnode.next.previous=newnode;
//		head=newnode;
//	}
//	else {
//		ListNode current=head;
//		while(current.next!=null && current.next.data<newnode.data) {
//			current=current.next;
//			}
//		newnode.next=current.next;
//		if(current.next!=null) {
//			newnode.next.previous=newnode;
//		}current.next=newnode;
//		current=newnode;
//	}
//}




//public void delete(int position) {
//	if(position==1) {
//		head=head.next;
//	}
//	else {
//		ListNode prev=head;
//		int count=1;
//		while(count<position-1) {
//			prev=prev.next;
//			count++;
//		}
//		ListNode current=prev.next;
//		if(current.next!=null) {
//		prev.next=current.next;
//		current.next.previous=current.previous;
//	}else{
//		prev.next=null;
//		}
//	}
//}




//public void removeduplicates() {
//	if(head==null) {
//		return;
//	}
//	ListNode current=head;
//	while(current!=null && current.next!=null) {
//		if(current.data==current.next.data) {
//			ListNode temp=current.next;
//			if(temp.next!=null) {
//			current.next=temp.next;
//			temp.next.previous=temp.next;
//		}else {
//			current.next=null;
//		}
//		}
//		else {
//			current=current.next;
//		}
//	}
//}



//public ListNode reverse() {
//	if(head==null) {
//		return head;
//	}
//	ListNode current=head;
//	//ListNode next=null;
//	ListNode prev=null;
//	while(current!=null) {
//		prev=current.previous;
//		current.previous=current.next;
//		current.next=prev;
//		current=current.previous;
//	}
//	if(prev!=null) {
//		head=prev.previous;
//	}
//	return prev;
//
//}




	public static void main(String[] args) {
		Doubly_LinkedList dll=new Doubly_LinkedList();
		dll.insertLast(1);
		dll.insertLast(2);
		dll.insertLast(5);
		dll.insertLast(5);
		
//		dll.displayforward();
//		dll.displaybackward();
//		
//		dll.insertnode(8);
//		dll.displayforward();
//		
//		dll.deletefirst();
//		dll.displayforward();
//
//		dll.deletelast();
//		dll.displayforward();
		
		dll.displayforward();
		//dll.Reverse();
		//dll.displayforward();
//		dll.Getnth(2);
//		dll.displayforward();
//		dll.SwapKthelement(4, 2);
//		dll.displayforward();
		//dll.Pairsum(3);
		//dll.insertinsorted(3);
		//dll.displayforward();
		//dll.delete(4);
		//dll.displayforward();
		//dll.removeduplicates();
		//dll.reverse();
		dll.displayforward();
	}

}
