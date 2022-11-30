package Practice_for_java;

public class Intersection {
	ListNode head1;
	ListNode head2;
private static class ListNode{
	private int data;
	private ListNode next;
	public ListNode(int data) {
		this.data=data;
		this.next=null;
	}
}

public void display1() {
	ListNode current =head1;
	while(current!=null) {
		System.out.print(current.data+"->");
		current=current.next;
	}
	System.out.println("null");
}


public void display2() {
	ListNode current =head2;
	while(current!=null) {
		System.out.print(current.data+"->");
		current=current.next;
	}
	System.out.println("null");
}


ListNode findintersection(ListNode head1,ListNode head2) {
	ListNode dummy = new ListNode(1);
	ListNode current=dummy;
	ListNode temp1=head1;
	ListNode temp2=head2;
	while(temp1!=null && temp2!=null) {
		if(temp1.data==temp2.data) {
			ListNode new_node=new ListNode(temp1.data);
			current.next=new_node;
			current=current.next;
			temp1=temp1.next;
			temp2=temp2.next;
			
		}else if(temp1.data<temp2.data) {
			temp1=temp1.next;
		}else if(temp1.data>temp2.data) {
			temp2=temp2.next;
		}
	}return dummy.next;
	
}


	public static void main(String[] args, Object dummy) {
	

		Intersection sll=new Intersection();
		sll.head1=new ListNode(10);
		ListNode second =new ListNode(11);
		ListNode third =new ListNode(12);
		ListNode fourth =new ListNode(13);
		
		sll.head1.next=second;
		second.next=third;
		third.next=fourth;	
		
		
		sll.head2=new ListNode(11);
		ListNode second2 =new ListNode(12);
		ListNode third2 =new ListNode(16);
		ListNode fourth2 =new ListNode(17);
		
		sll.head2.next=second2;
		second2.next=third2;
		third2.next=fourth2;	
		
		sll.display1();
		sll.display2();
		sll.findintersection();
		
	
	}

}
