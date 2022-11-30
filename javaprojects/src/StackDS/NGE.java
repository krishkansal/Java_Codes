package StackDS;

public class NGE {
	
	static class stack{
		int top;
		int items[]=new int[100];
	
	void push(int x) {
		if(top==99) {
			System.out.println("stack full");
		}else {
			items[++top]=x;
		}
	}
	
	int pop() {
		if(top ==-1) {
			System.out.println("error");
			return -1;
		}else {
			int element=items[top];
			top--;
			return element;
		}
	}
	boolean isEmpty() {
		return (top==-1);
	}
	}
	
	
	static void printNGE(int arr[],int n) {
		int i=0;
		stack s = new stack();
		s.top=-1;
		int element;
		int next;
		
		s.push(arr[0]);
		for(i=1;i<n;i++) {
			next=arr[i];
			if(s.isEmpty()==false) {
				element=s.pop();
				
				while(element<next) {
					System.out.println(element+ " --> "+ next);
					if(s.isEmpty()==true) {
						break;
						
					}
					element=s.pop();
					
				}
				if(element>next) {
					s.push(element);
				}
		}
		s.push(next);
	}
			
			while (s.isEmpty()==false) {
				element=s.pop();
				next=-1;
				System.out.println(element + " -- " + next);
			}
			
			
			
		}
	
	

	public static void main(String[] args) {

		int arr[]= {11,13,21,3,4};
		int n=arr.length;
		printNGE(arr,n);
	}

}
