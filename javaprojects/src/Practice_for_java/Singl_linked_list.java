package Practice_for_java;

public class Singl_linked_list {
	ListNode head;
private static class ListNode{
	private int data;
	private ListNode next;
	public ListNode(int data) {
		this.data=data;
		this.next=null;
	}
}

public void display() {
	ListNode current =head;
	while(current!=null) {
		System.out.print(current.data+"->");
		current=current.next;
	}
	System.out.println("null");
}



public int length() {
	if(head==null) {
		return 0;
	}
	int count=0;
	ListNode current =head;
	while(current!=null) {
		count++;
		current=current.next;
	}
	return count;
}

//public void insertFirst(int value) {
//	ListNode newNode=new ListNode(value);
//	newNode.next=head;
//	head = newNode;
//}

//public void insertLast(int value) {
//	ListNode newNode=new ListNode(value) ;
//	if(head==null) {
//		head=newNode;
//		return;
//	}
//	ListNode current=head;
//	while(current.next!=null) {
//		current=current.next;}
//		current.next=newNode;
//
//}
//public ListNode deleteFirst() {
//	if(head==null) {
//		return null;
//	}
//	ListNode temp=head;
//	head=head.next;
//	temp.next=null;
//	return temp;
//}

//public ListNode deleteLast() {
//	if(head==null || head.next==null) {
//		return head;
//	}
//	ListNode current=head;
//	ListNode previous=null;
//	while(current.next!=null) {
//		previous=current;
//		current=current.next;
//		}
//	previous.next=null;
//	return current;
//}
//public boolean find(int searchkey) {
//	if(head==null) {
//		return false;
//	}
//	ListNode current=head;
//	while(current!=null) {
//		if(current.data==searchkey) {
//			return true;
//			
//		}
//		current=current.next;
//		
//	}
//	return false;
//}

//public ListNode reverse() {
//	if(head==null) {
//		return head;
//	}
//	ListNode current=head;
//	ListNode next=null;
//	ListNode previous=null;
//	while(current!=null) {
//		next=current.next;
//		current.next=previous;
//		previous=current;
//		current=next;
//	}
//	return previous;
//}

//public ListNode getMiddleNode() {
//	if(head==null) {
//		return null;
//	}
//	ListNode slowPtr=head;
//	ListNode fastPtr=head;
//	while(fastPtr!=null && fastPtr.next!=null) {
//		slowPtr=slowPtr.next;
//		fastPtr=fastPtr.next.next;
//	}
//	return slowPtr;
//}


//public void removeDuplicate() {
//	if(head==null) {
//		return;
//	}
//	ListNode current=head;
//	while(current!=null && current.next!=null) {
//		if(current.data==current.next.data) {
//			current.next=current.next.next;
//		}
//		current=current.next;
//	}
//}

public void removeDuplicateFromUnsorted() {
	if(head==null) {
		return;
	}
	ListNode ptr=head;
	ListNode ptr2=head.next;
	ListNode prev=head;
	while(ptr!=null && ptr2!=null) {
		if(ptr.data==ptr2.data) {
			prev.next=ptr2.next;
			ptr2=prev.next;	
		}
		prev=ptr2;
		ptr2=ptr2.next;
	}
	ptr=ptr.next;
}

//public ListNode insertSortedList(int value) {
//	ListNode newNode=new ListNode(value);
//	if(head==null) {
//		return newNode;
//		
//	}
//	ListNode current=head;
//	ListNode temp=null;
//	while(current!=null && current.data<newNode.data) {
//		temp=current;
//		current=current.next;
//	}
//	newNode.next=current;
//	temp.next=newNode;
//	return head;
//}

//public void deleteKey(int key) {
//	if(head==null) {
//		return ;
//	}
//	ListNode current=head;
//	ListNode temp=null;
//	if(current!=null && current.data==key) {
//		head=current.next;
//		return;
//	}
//	while(current!=null && current.data!=key) {
//		temp=current;
//		current=current.next;
//	}
//	temp.next=current.next;
//}
//public boolean detectLoop() {
//	ListNode fastptr=head;
//	ListNode slowptr=head;
//	while(fastptr!=null && fastptr.next!=null) {
//		fastptr=fastptr.next.next;
//		slowptr=slowptr.next;
//		if(fastptr==slowptr) {
//			return true;
//		}
//	}
//	return false;
//}
//public ListNode StartNodeLoop() {
//	ListNode fastptr=head;
//	ListNode slowptr=head;
//	while(fastptr!=null && fastptr.next!=null) {
//		fastptr=fastptr.next.next;
//		slowptr=slowptr.next;
//		if(fastptr==slowptr) {
//			return getStartingNode(slowptr);
//		}
//		
//	}
//	return null;
//}

//private ListNode getStartingNode(ListNode slowptr) {
//	ListNode temp=head;
//	while(temp!=slowptr) {
//		temp=temp.next;
//		slowptr=slowptr.next;
//	}
//	return temp;
//}

//public ListNode StartNodeLoop() {
//	ListNode fastptr=head;
//	ListNode slowptr=head;
//	while(fastptr!=null && fastptr.next!=null) {
//		fastptr=fastptr.next.next;
//		slowptr=slowptr.next;
//		if(fastptr==slowptr) {
//			return removeLoop(slowptr);
//		}
//		
//	}
//	return null;
//}
//private ListNode removeLoop(ListNode slowptr) {
//	ListNode temp=head;
//	while(temp.next!=slowptr.next) {
//		temp=temp.next;
//		slowptr=slowptr.next;
//	}
//	slowptr.next=null;
//}

//public void insert(int position , int value) {
//	ListNode node=new ListNode(value);
//	if(position==1) {
//		node.next=head;
//		head=node;
//	}else {
//		ListNode previous = head;
//		int count=1;
//		while(count<position-1) {
//			previous=previous.next;
//			count++;
//		}
//		ListNode current=previous.next;
//		node.next=current;
//		previous.next=node;
//	}
//	
//}

//public int Getnth(int index) {
//	ListNode current=head;
//	int count=0;
//	while(current!=null) {
//		if(count==index) {
//			return current.data;
//		}
//		count++;
//		current=current.next;
//	}
//	return 0;
//}

//public ListNode getfromlast(int n) {
//	ListNode mainptr=head;
//	ListNode refptr=head;
//	int count=0;
//	while(count<n) {
//		refptr=refptr.next;		
//		count++;
//	}
//	while(refptr!=null) {
//		refptr=refptr.next;
//		mainptr=mainptr.next;
//	}
//	return mainptr;
//	
//}

//public boolean isPalindrome() {
//	ListNode slowPtr=head;
//	ListNode fastPtr=head;
//	while(fastPtr!=null && fastPtr.next!=null) {
//		slowPtr=slowPtr.next;
//		fastPtr=fastPtr.next.next;
//	}
//	ListNode current=head;
//	ListNode next=null;
//	ListNode previous=null;
//	while(current!=null) {
//		next=current.next;
//		current.next=previous;
//		previous=current;
//		current=next;
//	}
//	fastPtr=head;
//	while(previous!=null) {
//		if(fastPtr.data!=previous.data) {
//			return false;}
//			fastPtr=fastPtr.next;
//			previous=previous.next;
//	}
//	return true;
// }


//public void SwapNodes(int x, int y) {
//
//	if(x==y) {
//		return ;
//	}
//	ListNode currentX=head;
//	ListNode prevX=null;
//	while(currentX!=null && currentX.data!=x){
//		prevX=currentX;
//		currentX=currentX.next;
//	}
//	ListNode currentY=head;
//	ListNode prevY=null;
//	while(currentY!=null && currentY.data!=y) {
//		prevY=currentY;
//		currentY=currentY.next;
//	}
//	if(currentX==null || currentY==null) {
//		return ;
//	}
//	
//	if(prevX==null) {
//		head=currentY;
//}else {
//	prevX.next=currentY;
//}
//	if(prevY==null) {
//		head=currentX;
//	}else {
//		prevY.next=currentX;
//	}
//	
//	ListNode temp=currentY.next;
//	currentY.next=currentX.next;
//	currentX.next=temp;
//	
//	
//}

//public void Pairwise_Swap() {
//	ListNode current=head;
//	ListNode prev=null;
//	while(current!=null && current.next!=null) {
//		ListNode temp=current.next;
//		current.next=temp.next;
//		temp.next=current;
//		
//	if(prev==null) {
//		head=temp;
//	}else {
//		prev.next=temp;
//	}
//	prev=current;
//	current=current.next;
//	}
//}

//public void LastnodeToFirst() {
//	ListNode current=head;
//	ListNode prev=null;
//	while( current.next!=null) {
//		prev=current;
//		current=current.next;
//	}
//	prev.next=null;
//	current.next=head;
//	head=current;
//	
//}

public void sorting() {
	ListNode temp=head;
	ListNode current=temp.next;
	while(current!=null) {
		if(current.data==temp.data) {
			temp.next=current.next;
			current.next=temp;
		}
		temp=temp.next;
	}
}


	public static void main(String[] args) {
		Singl_linked_list sll=new Singl_linked_list();
		sll.head=new ListNode(10);
		ListNode second =new ListNode(3);
		ListNode third =new ListNode(10);
		ListNode fourth =new ListNode(11);
		
		sll.head.next=second;
		second.next=third;
		third.next=fourth;	
		
		
		
//		sll.display();
//		System.out.println(sll.length());
//		sll.insertFirst(10);
//		sll.insertLast(15);
//		sll.display();
//		System.out.println(sll.deleteFirst().data);
//		sll.display();
//		System.out.println(sll.deleteLast().data);
//		sll.display();
//		System.out.println(sll.find(1));
//			
//		System.out.println(sll.deleteLast().data);
//		sll.display();
//		System.out.println(sll.getMiddleNode().data);
//		sll.insertLast(10);
//		sll.display();
//		//System.out.println(sll.insertSortedList(10));
//		sll.deleteKey(10);
//		sll.display();
//		System.out.println(sll.detectLoop());
//		System.out.println(sll.StartNodeLoop());
//		sll.insert(1, 3);
//		sll.display();
//		System.out.println(sll.Getnth(1));
//	    System.out.println(sll.getfromlast(1).data);
//		//sll.isPalindrome();
//	    //sll.removeDuplicate();
//	    sll.removeDuplicate();
		
		//sll.display();
		//sll.removeDuplicateFromUnsorted();
		//sll.display();
		//sll.SwapNodes(3, 11);
	    //sll.display();
		//sll.Pairwise_Swap();
		//sll.display();
		//sll.LastnodeToFirst();
		sll.display();
		sll.sorting();
		
	}
}