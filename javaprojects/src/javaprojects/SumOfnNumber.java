package javaprojects;

import java.util.Scanner;

public class SumOfnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = scan.nextInt();
		int i = 1;
		int sum = 0;
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		 System.out.println("Sum = "+sum);
	}
}