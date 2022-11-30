package Java;
import java.util.Scanner;


public class ConditionalStatements {

	public static void main(String[] args) {
		
		
						//If-else statement
		
		
		System.out.println("Relational Operator := ");
		int age = 16;  //Relational Operators:= >= , > , < , <= , == , = , != 
		if(age>18)  { 
			System.out.println("Yes boy you can drive");
		}
		else {
			System.out.println("No boy you cannot drive yet");
		}
		
		
		
		
				//Logical Operators:= && , || , !( (true=false) (false=true) )
		
		
		
		System.out.println("Logical Operators := ");
		boolean a = true;
		boolean b = false;
		if(a && b) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		
		
					//else-if statements
		
		
		
		int age1=56;
		if(age1>56) {
			System.out.println("Experienced");
		}
		else if(age1>46) {
			System.out.println("Experienced 1");
		}
		else if(age1>36) {
			System.out.println("Experienced 2");
		}
		else {
			System.out.println("Not");
		}
		
		
		
					//Switch statements
		
		Scanner s=new Scanner(System.in);
		int age2=s.nextInt();
		switch(age2) {
		case 18:
			System.out.println("Adult");
			break;
		case 23:
			System.out.println("Job");
			break;
		case 60:
			System.out.println("Retired");
			break;
		default:
			System.out.println("Enjoy");
		}

		
		
		
		
	}

}
