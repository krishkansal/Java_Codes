package Java;
import java.util.Scanner;
public class PassFailProg {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter marks in m1");
		float m1=s.nextFloat();
		System.out.println("Enter marks in m2");
		float m2=s.nextFloat();
		System.out.println("Enter marks in m3");
		float m3=s.nextFloat();
		float sum=m1+m2+m3;
		System.out.println(sum);
		float avg=(sum/300)*100;
		System.out.println(avg);
		if(m1>=33 && m2>=33 && m3>=33) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		
	}

}
