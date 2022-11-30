package Double_Linked_List;


public class Practice {
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
public Practice() {
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

	public static void main(String[] args) {
		Practice dll1=new Practice();
		dll1.insertLast(1);
		dll1.insertLast(10);
		dll1.insertLast(15);

		dll1.displayforward();
	}

}
