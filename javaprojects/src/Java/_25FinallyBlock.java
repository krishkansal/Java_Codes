package Java;

public class _25FinallyBlock {
	
	public static void greet() {
		try {
			int a=6000;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		finally {
		System.out.println("End of program");
		}
		
	}
		public static void main(String[] args) {
		greet();
}
		
}