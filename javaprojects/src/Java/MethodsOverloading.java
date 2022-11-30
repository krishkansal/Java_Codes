package Java;

public class MethodsOverloading {

	static void foo() {
		System.out.println("good morning bro");
	}
	
	static void foo() {   //Parameters = a
		System.out.println("good morning  bro");
	}
	
	
	public static void main(String[] args) {
		
		foo();
		foo();  //argument= actual value(3000)
	}

}
