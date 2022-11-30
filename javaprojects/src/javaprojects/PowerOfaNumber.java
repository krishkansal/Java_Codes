package javaprojects;

import java.util.Scanner;

public class PowerOfaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in); 
		   int x = s.nextInt();
		   int n = s.nextInt();
		   int result = (int)Math.pow(x, n);
		   System.out.println(result);
			
	}

}
