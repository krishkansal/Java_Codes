package JavaPractice;

class A{
	String name;
}
class B extends A{
	int Roll_no;
	public void print() {
		System.out.println(name+" roll_no is "+ Roll_no);
	}
}
public class Inheritence {

	public static void main(String[] args) {
		B obj = new B();
		obj.name="Krish";
		obj.Roll_no=1412;
		obj.print();

		
	}

}
