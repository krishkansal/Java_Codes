package Inheritance;

public class Teacher_Person_Result {

	public static void main(String[] args) {

		Teacher t =new Teacher();
		t.name="Krish";
		t.eat();
		t.walk();
		t.teach();
		
		Person p =t;
		p.name="deepak";
		p.eat();
	}

}
