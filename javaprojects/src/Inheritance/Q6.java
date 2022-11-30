package Inheritance;

interface I_one{
	static int comute(int x) {
		return x*x*x;
	}
}
interface I_two{
	final static double PI=3.14;
	default double area(int y) {
		return PI*y*y;
	}
	static void display() {
		System.out.println("Square root 10= "+Math.sqrt(10));
	}
}


public class Q6 implements I_one, I_two { 

	public static void main(String[] args) {
		 Q6 ife = new Q6();
		    System.out.println("area = " + ife.area(10) );
		    System.out.println("The cube of 4 = " + I_one.comute(4));
		    I_two.display();
	}

}
