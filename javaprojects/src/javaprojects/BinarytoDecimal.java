package javaprojects;

public class BinarytoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1010;
		System.out.print("Binary Number: "+n);
		int rem=0;
		int p=0;
		int r=0;
		while(n>0) {
			rem=n%10;
			r=r+(rem*(int)Math.pow(2, p++));
			n=n/10;
		}System.out.println();
		System.out.print("Decimal Number: "+r);
	}

}
