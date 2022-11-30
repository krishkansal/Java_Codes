package Inheritance;
import java.util.Scanner;
class Bank{
	float rate=0.0f;
	float Rate() {
		return 0.0f;
	}
}
class SBI extends Bank{
	float rate=8.4f;
	float Rate() {
		return rate;
	}
}
class ICICI extends Bank{
	float rate=7.3f;
	float Rate() {
		return rate;
	}
}
class Axis extends Bank{
	float rate=9.7f;
	float Rate() {
		return rate;
	}
}
public class Q5 {

	public static void main(String[] args) {
		int ch;
	
		
		int flag =1;
		
		
		System.out.println("Enter Your Choice");
		System.out.println("1. SBI");
		System.out.println("2. ICICI");
		System.out.println("3. AXIS");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		int amount=sc.nextInt();
		int year=sc.nextInt();
		
		
		Bank ob=null;  // Reference Variable of parent class
		if(ch ==1)
		{
			ob=new SBI();
		}
		else if(ch==2)
		{
			ob=new ICICI();
		}
		else if(ch==3)
		{
			ob=new Axis();
		}
		else
		{
			System.out.println("enter right bank");
			flag=0;
			
		}
		
		if(flag==1)
		{
		float m=ob.Rate();
		System.out.println("total amount is: "+amount*year*m/100);
		sc.close();
		}

	}

}
