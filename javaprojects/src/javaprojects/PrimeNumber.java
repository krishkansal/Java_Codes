package javaprojects;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		 int n =  s.nextInt();
		
		int i = 2 ;
		boolean isPrime = true;
		while(i <=n - 1) {
		 if(n%i==0) {
			 System.out.println("composite");
			 isPrime = false;
			 return;
		 }
		 i++;
		 
		}
		System.out.println("Prime");
		
		
		
		
		
		
		
		//	if(isPrime==true) {
			//	System.out.println("Prime");
		//	}
		//	else {
		//		System.out.println("Composite");
		//	}
		 
		 
		 
		 
		   
		}
       
     
        }
	



