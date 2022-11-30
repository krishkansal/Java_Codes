package Java;

public class _24Throw {
	public static int div (int a , int b) throws ArithmeticException {
		int result = a/b;
		return result;
	}
	public static void main(String[] args) {
		try {
		int c=div(6,0);
		System.out.println(c);
		}
		catch(Exception e){
		System.out.println(e);
		}
		
	}

}
