package Inheritance;

class A{
	String name;
	int roll_number ;
}

class B extends A{
	
	}

class C extends B{
	public void print() {
		System.out.print("Name: "+name+", Roll_Number: "+roll_number);
}
}
public class Q1 {

	public static void main(String[] args) {
		C obj=new C();
		obj.name="Krish";
		obj.roll_number=412;
		obj.print();
			
	}

}
