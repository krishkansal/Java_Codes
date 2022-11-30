package Vector_Stacks;

import java.util.Stack;


public class Vector1 {

	public static void main(String[] args) {

		Stack<Integer> s=new Stack();
		s.push(22);
		s.push(24);
		s.push(36);
		int poped=s.pop();
		int peeked=s.peek();
		System.out.println(poped);
		System.out.println(peeked);
		
			
	}

}
