package Queue;

class queue1{
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	Node front=null;
	Node rear=null;
	
	public void enqueue(int data) {
		Node newnode=new Node(data);
		if(front==null) {
			front=newnode;
			rear=newnode;
		}else {
			rear.next=newnode;
			rear=newnode;
		}
	}
	
	public void dequue() {
		if(front==null) {
			System.out.println("underflow");
		}else {
			front=front.next;
		}
	}
	
	public void display() {
		Node temp=front;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
}
public class UsingLinkedList {

	public static void main(String[] args) {

		queue1 q=new queue1();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.display();
		System.out.println("AFTER DEQUUE: ");
		q.dequue();
		q.dequue();
		q.display();
	}

}
