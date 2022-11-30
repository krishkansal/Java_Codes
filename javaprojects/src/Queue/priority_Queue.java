package Queue;

public class priority_Queue {
	ListNode head;
public static class ListNode{
	private int data;
	private int priority;
	private ListNode next;
	
	public static ListNode node= new ListNode();
	
	static ListNode newnode(int d,int p) {
		ListNode temp=new ListNode();
		temp.data=d;
		temp.priority=p;
		temp.next=null;
		return temp;
		
	}
	
	static int peek(head) {
		return (head).data;
	}
}




	public static void main(String[] args) {

		
	}

}
