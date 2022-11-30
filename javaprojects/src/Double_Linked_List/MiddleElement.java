package Double_Linked_List;

public class MiddleElement {
	private ListNode head;
	private ListNode mid;
	private ListNode top;
	private int size;
	
private class ListNode {
	private int data;
	private ListNode next;
	private ListNode previous;
	
public ListNode(int data) {
	this.data=data;
}
}


public int size() {
	return size;
}

public boolean isEmpty() {
	return size==0;
}



public void push(int data) {
	ListNode newnode=new ListNode(data);
	
	if(size==0) {
		head=newnode;
		mid=newnode;
		size++;
		return;
	}
	head.next=newnode;
	newnode.previous=head;
	head=head.next;
		if(size%2!=0) {
			mid=mid.next;
		}
		size++;
}

public int pop() {
	int data=-1;
	if(size==0) {
		System.out.println("stack empty");
	}
	if(size!=0) {
			if(size==1) {
				head=null;
				mid=null;
			}else {
				data=head.data;
				head=head.previous;
				head.next=null;
					if(size%2==0) {
						mid=mid.previous;
					}
			}
			size--;
	}
	return data;
}	
public int findMiddle() {
	if(size==0) {
		System.out.println("Stack is empty");
		return -1;
		
	}
	return mid.data;
}

public void deleteMiddle() {
	if(size!=0) {
			if(size==1) {
				head=null;
				mid=null;
			}else if(size==2) {
				head=head.previous;
				mid=mid.previous;
				head.next=null;
				}else {
					mid.next.previous=mid.previous;
					mid.previous.next=mid.next;
					if(size%2==0) {
						mid=mid.previous;
					}else {
						mid=mid.next;
					}
				}
			size--;
			
	}
}
	public static void main(String[] args) {
		MiddleElement st=new MiddleElement();
		st.push(10);
		st.push(15);
		st.push(20);
		st.push(25);
		
		System.out.println(st.findMiddle());
		System.out.println(st.pop());
		System.out.println(st.findMiddle());
		st.deleteMiddle();
		System.out.println(st.findMiddle());
		

	}

}
