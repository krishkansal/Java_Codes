package Single_LinkedList;

public class Revice {
	private ListNode head;
private static class ListNode{
	private int data;
	private ListNode next;
public ListNode(int data) {
	this .data=data;
	this.next=null;
}
}
public void display(){
	ListNode current =head;
	while(current!=null) {
		System.out.println(current.data+" ");
		current=current.next;
	}System.out.println("null");
}

	public static void main(String[] args) {

		Revice sll=new Revice();
		sll.head=new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(2);
		
		sll.head.next=second;
		second.next=third;
		
		sll.display();
	}

}
