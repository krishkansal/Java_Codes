package Java;

class Base{
	Base(){
		System.out.println("Krish");
	}
	Base(int a){
		System.out.println(a);
	}
}

class Subclass extends Base{
	Subclass(){
		super(0); //Recent Argument calling
		System.out.println("Deepak");
	}
		Subclass(int x , int y){
			System.out.println(x);
			System.out.println(y);
		}
	}


public class _16InheritanceConstructor {

	public static void main(String[] args) {
		Subclass obj=new Subclass();
		Subclass obj1=new Subclass(5,4);
	}

}
