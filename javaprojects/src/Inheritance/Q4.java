package Inheritance;

import java.util.Scanner;

class bike1{
	void run(){
	
	}
	
}
class Splendor extends bike1{
	void run() {
		System.out.println("Splendor");
	}
}
class Scooter extends bike1{
	void run() {
		System.out.println("Scooter");
	}
	
}
class Activa extends bike1{
	void run() {
		System.out.println("Activa");
	}
	
}

public class Q4 {

	public static void main(String[] args) {
		
		System.out.println("1 Splendor");
		System.out.println("2 Scooter");
		System.out.println("3 Activa");
		
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		if (n==1) {
			bike1 obj=new Splendor();
			obj.run();
			
		}
		else if (n==2) {
			bike1 obj=new Scooter();
			obj.run();
			
		}
		else if (n==3) {
			bike1 obj=new Activa();
			obj.run();
			
		}
		else {
			System.out.println("Enter a valid no");
		}
		
	}

}
