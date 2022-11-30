package Single_LinkedList;


public class Practice1 {


	
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
	
	public void delete(int position) {
		if(position==1) {
			head=head.next;
		}else {
			ListNode previous= head;
			int count=1;
			while(count<position-1) {
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			previous.next=current.next;
		}
	}
	public int length() {
		if(head==null) {
			return 0;
		}
		int count=0;
		ListNode current=head;
		while(current!=null) {
			current=current.next;
			count++;
		}
		return count;
	}
	
	public ListNode reverse(ListNode head) {
		if(head==null) {
		return head;
	}
	ListNode current=head;
	ListNode previous=null;
	ListNode next=null;
	while(current!=null) {
	next=current.next;
	current.next=previous;
	previous=current;
	current=next;
	}
	return previous;
	
	}

	public static void main(String[] args) {

		Practice1 sll=new Practice1();
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
		//System.out.println(sll.length());
		
		ListNode reverse=sll.reverse(second);
		sll.display();
	}
	
}
