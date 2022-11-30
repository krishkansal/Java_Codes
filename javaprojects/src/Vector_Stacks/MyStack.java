package Vector_Stacks;

import Array.Node1;

public class MyStack {

	private Node1 ll = new Node1();
	void push( int e) {
		ll.add(e);
		
	}
	
	int pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Popping from empty stack is not allowed");
		}
		return 0;
		
	}
	
	int peek() {
		
	}

}
