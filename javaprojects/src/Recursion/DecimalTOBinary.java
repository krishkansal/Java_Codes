package Recursion;

public class DecimalTOBinary {

	public int dTob(int n) {
		if(n==0) {
			return 0;
		}
		return n%2+10*dTob(n/2);
	}
	public static void main(String[] args) {
		DecimalTOBinary result=new DecimalTOBinary();
		System.out.println(result.dTob(10));
		
	}

}

