package Java;

abstract class Parent{
	
	public Parent() {
		System.out.println("Hello Child");
	}
	public void sayHello() {
		System.out.println("Hello");
	}
	abstract public void great();
}

class Child extends Parent{
	@Override
	public void great() {
		System.out.println("Good Morning");
		
	}
}

public class _18AbstractClassMethods {

	public static void main(String[] args) {

		Child obj=new Child();
	}

}
