package StackDS;
import java.util.Stack;
public class SortingUsingRecursion {
	static Stack<Integer> st=new Stack<>();
	static void insert_correct_position( int x) {
		if(st.isEmpty() || x > st.peek()) {
			st.push(x);
		}else {
			int a = st.peek();
			st.pop();
			insert_correct_position(x);
			st.push(a);
		}
	}
	
static void reverse() {
		if(st.size()>0) {
			int x = st.peek();
			st.pop();
			reverse();
			insert_correct_position(x);
		}
	}



	public static void main(String[] args) {
		st.push(-3);
		st.push(14);
		st.push(18);
	    st.push(-5);
	    st.push(30);
		System.out.println(st);
	    
	    System.out.println();
		reverse();
		
		System.out.println(st);
	}

}
