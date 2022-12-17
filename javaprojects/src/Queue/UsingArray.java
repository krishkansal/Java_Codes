package Queue;

class queue{
	int front=-1;
	int rear=-1;
	int n=10;
	int arr[]=new int[n];
	
	void enqueue(int data) {
		if(rear==(n-1)) {
			System.out.println("overflow");
		}else if(front==-1 && rear==-1){
			front=0;
			rear=0;
			arr[rear]=data;
		}else {
			rear=rear+1;
			arr[rear]=data;
		}
	}
	
	void dequeue() {
		if(front==-1 && rear==-1) {
			System.out.println("underlow");
		}else {
			front=front+1;
		}
	}
	
	void display() {
		for(int i=front;i<=rear;i++) {
			System.out.println(arr[i]);
		}
	}
}

public class UsingArray {

	public static void main(String[] args) {
		queue q=new queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.display();
		
		
		System.out.println("After dequeue:");
		q.dequeue();
		q.display();
		
	}

}
