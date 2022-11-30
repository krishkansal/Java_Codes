package Java;

public class ValueChangeMethods {
	
	
	static void tell() {
		System.out.println("Krish");
	}
	
	
	static void change(int x) {
		x=45;
	
	}
	
	static void change1(int [] arr) {
		arr[0]=98;
	}

	public static void main(String[] args) {
	//	tell();
		
					//change the integer
	//	int x=50;
	//	change(x);
	//	System.out.println(x);
		
					//change the array
		
		int [] marks = {100,60,90,80,50,100};
		change1(marks);
		System.out.println(marks[0]);
		
		
	}

}
