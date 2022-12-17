package Queue;


class queue1{
	int front=-1;
	int rear=-1;
	int n=5;
	int arr[]=new int[n];
	
	void enqueue(int data) {
		if(front==(rear+1)%n) {
			System.out.println("overflow");
		}else if(front==-1 && rear==-1){
			front=0;
			rear=0;
			arr[rear]=data;
		}else {
			rear=(rear+1)%n;
			arr[rear]=data;
		}
	}
	
	void dequeue() {
		if(front==-1 && rear==-1 ) {
			System.out.println("underlow");
		}else {
			front=(front+1)%n;
		}
	}
	
	void display() {
		for(int i=front;i!=rear;i=(i+1)%n) {
			System.out.println(arr[i]);
		}
	}
}
public class CircularQueue {

	public static void main(String[] args) {

		queue1 q1=new queue1();
		q1.enqueue(20);
		q1.enqueue(20);
		q1.enqueue(30);
		q1.enqueue(40);
		q1.display();
		
		
		System.out.println("After dequeue:");
		q1.dequeue();
		q1.display();
		
		
	}

}
