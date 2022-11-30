package Practice_for_java;


public class Palindrome {
	private static ListNode head;
	static class ListNode{
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

	
	
	public boolean isPalindrome(ListNode head) {
		ListNode slowPtr=head;
		ListNode fastPtr=head;
		while(fastPtr!=null && fastPtr.next!=null) {
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
		}
		ListNode current=head;
		ListNode next=null;
		ListNode previous=null;
		while(current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		fastPtr=head;
		while(previous!=null) {
			if(fastPtr.data!=previous.data) 
				return false;
				fastPtr=fastPtr.next;
				previous=previous.next;
		}
		return true;
		
		
			
		}	
	
	

	public static void main(String[] args) {
		Palindrome sll=new Palindrome();
		sll.head=new ListNode(1);
		ListNode second =new ListNode(3);
		ListNode third =new ListNode(3);
		ListNode fourth =new ListNode(1);
		
		sll.head.next=second;
		second.next=third;
		third.next=fourth;	
		
		sll.display();
		
		System.out.println(sll.isPalindrome(head));
	}

}
