package Recursion;

public class Factorial {
	
	public int factorial(int n) {
		if(n<1) {
			return -1;
		}if(n==0 || n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}

	public static void main(String[] args) {
		Factorial fac= new Factorial();
		System.out.println(fac.factorial(3));

	}

}
