package Single_LinkedList;

public class SLL {
			 Node head;
static class Node{
			 int data;
			 Node next;
Node(int data) {
			this.data=data;
			this.next=null;
		}
	}

public static SLL insert(SLL list,int data) {
	Node newnode=new Node(data);
	
	if(list.head==null) {
		list.head=newnode;
	}
	else {
		Node last=list.head;
		while(last.next!=null) {
			last=last.next;
		}
		
		last.next=newnode;
	}
	return list;
	
}



//To add the node at the First of SLL-------->
public static SLL insertfirst(SLL list,int value) {
	Node newNode=new Node(value);
	newNode.next=list.head;
	list.head=newNode;
	return list;
}



//To add the node at the Last of SLL-------->
public static SLL insertlast(SLL list,int value) {
	Node newnode=new Node(value);
	if(list.head==null) {
		list.head=newnode;
		return list;
	}
	Node current=list.head;
	while(current.next!=null) {
		current=current.next;
	}
	current.next=newnode;
	return list;
}

//To delete the First node in the SLL-------->

public static SLL deletefirst(SLL list) {
	if(list.head==null) {
		return null;
	}
	Node current=list.head;
	list.head=current.next;
	current.next=null;
	return list;
}





//To Search an element in the SLL-------->
public boolean search(int value) {
	if(head==null) {
		return false;
	}
	Node current=head;
	while(current!=null) {
		if(current.data==value) {
			System.out.println("find");
			return true;
			
		}
		current=current.next;
	}
	System.out.println("not found");
	return false;
	
	
}


	public static void display(SLL list) {
		Node current=list.head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}System.out.println("null");
	}

	public static void main(String[] args) {
		SLL list=new SLL();
		list=insert(list,1);
		list=insert(list,2);
		list=insert(list,3);
		list=insert(list,4);
		list=insert(list,5);
		list =insertfirst(list,8);
		list=insertlast(list,10);
		display(list);
		
		list=deletefirst(list);
		display(list);
		
		
		list.search(1);
	
	}

}
