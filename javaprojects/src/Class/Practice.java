package Class;

import java.util.Scanner;

public class Practice {
	
//	
//	public static String DayName(int dn) {
//		String temp = null;
//		switch(dn) {
//		case 0:temp="Sunday";
//			break;
//		case 1:temp="Monday";
//			break;
//		case 2:temp="Tuesday";
//			break;
//		case 3:temp="Wednesday";
//			break;
//		case 4:temp="Thursday";
//			break;
//		case 5:temp="Friday";
//			break;
//		case 6:temp="Saturday";
//			break;
//		default: System.out.println("Invalid");
//		}
//		return temp;
//	}
//	
	

//	public static void Grade(int marks) {
//		if(marks>=90&& marks<=100) {
//			System.out.println("Grade A");
//			}else if(marks>=80&& marks<90){
//				System.out.println("Grade B");
//			}else if(marks>=70 && marks<80) {
//				System.out.println("Grade C");
//			}else if(marks>=60 && marks<80) {
//				System.out.println("Grade D");
//			}else if(marks>=0 && marks<60) {
//				System.out.println("Grade E");
//			}
//		
//	}
//	public static int Inc(int num) {
//		num=num+1;
//		return num;
//	}
//	public static int Dec(int num) {
//		num=num-1;
//		return num;
//	}
	
	
	public static void printpattern1(char a, int n) {
		for(int i=n;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(a);
			}
			System.out.println();
		}
	}
	
	public static void printpattern2(char a , int n) {
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(a);
			}
			System.out.println();
		}
	}
	
	

	public static void printpattern3( int n) {
		for(int i=n;i>0;i--) {				//pattern
			for(int j=1;j<=i;j++) {			//line
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
	
		String s="abcd";
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		//printpattern1('*',5);
		//printpattern2("*",5);
		//printpattern3(5);
		
		
		
//		int n=4;
//		for(int i=n;i>0;i--) {
//			for(int j=0;j<i;j++) {
//				System.out.print("*");	
//			}System.out.println();
//			
//		}
		
//		System.out.println(DayName(0));
		
//		Scanner sc=new Scanner(System.in);
//	int marks=sc.nextInt();
//	Grade(marks);
		
//		int a=2147483647;
//		int b=-2147483648;
//		System.out.println("Before Increment: "+a);
//		System.out.print("After Increment:");
//		System.out.println(Inc(a));
//		System.out.println("Before Decrement: "+b);
//		System.out.print("After Decrement:");
//		System.out.println(Dec(b));
	}

}
