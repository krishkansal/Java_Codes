package Circular_LinkedList;

public class CircularList {
	
     Node head;
	 Node tail;
	 int length;

	private class Node{
		 int data;
		 Node next;
		
	public Node(int data) {
		this.data=data;
		
			}
		}
	
	public Node create(int value){
		Node node=new Node(value);
		node.next=node;
		head=node;
		tail=node;
		length=1;
		return head;
				
	}
	
	public void insert(int value,int location) {
		Node newnode = new Node(value);
		if(head==null) {
			create(value);
		}else if(location==0) {
			newnode.next=head;
			head=newnode;
			tail.next=head;
		}else if(location>=length) {
			tail.next=newnode;
			tail=newnode;
			tail.next=head;
		}else {
			
		}
	}
	
	public static void main(String[] args) {
		CircularList cll= new CircularList();
		cll.create(5);
		cll.create(10);
		System.out.println(cll.head.data);
		
	}

}
