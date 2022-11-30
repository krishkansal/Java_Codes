package Queue;

public class Implement {
	private ListNode front;
	private ListNode rear;
	private int length;
	
	public Implement() {
		this.front=null;
		this.rear=null;
		this.length=0;
	}
	
	private class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public int length() {
		return length;
	}
	public boolean isEmpty() {
		return length == 0;
	}
	
public void enqueue(int data) {
	ListNode newnode=new ListNode(data);
	if(isEmpty()) {
		front=newnode;
		}else {
			rear.next=newnode;
		}
		rear=newnode;
		length++;
}

public void dequeue() {
	if(isEmpty()) {
		return ;
	}else {
		front=front.next;
		if(front==null) {
			rear=null;
			System.out.println("null");
		}
		length--;
		return;
	}
}

public void print() {
	if(isEmpty()) {
		return ;
	}
	ListNode current=front;
	while(current!=null) {
		System.out.print(current.data+ " --> ");
		current=current.next;
	}
	System.out.println("null");
}

	public static void main(String[] args) {
		Implement q=new Implement();
		q.enqueue(10);
		q.enqueue(20);
		q.print();
		q.dequeue();
		q.print();
		q.dequeue();
		q.print();
		
	}

}
