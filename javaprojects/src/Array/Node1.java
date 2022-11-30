package Array;

public class Node1 {
	
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			next = null;
		}
	}
	
	
	
	
	Node head;
	public void add(int data) {
		Node toAdd = new Node(data);
		
		if(head == null){
		head = toAdd;
		return;
		}
	
		
		
		
		Node temp=head;
		while(temp.next != null) {
			temp=temp.next;
		}
		temp.next=toAdd;
	}
	
	
	
	
	void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
	}
	
	
	
	public boolean isEmpty() {
		return head==null;
	}
	
	
	
	
	public void  RemoveLast() {
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		Node toRemove=temp.next;
		temp.next=null;
		System.out.println(toRemove.data);
		
	}
}
