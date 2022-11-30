package JavaPractice;

public class Exception_hanling {

	public static void main(String[] args) {

		try {
		int a=5;
		int b=0;
		int c=a/b;
		System.out.println(c);
	} catch(ArithmeticException e) {
		System.out.println(e.getMessage()+" pls check your code");
	}
		System.out.println("important");
	}

}
