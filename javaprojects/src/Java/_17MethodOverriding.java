package Java;

class Aa{
	
	public void meth2() {
		System.out.println("2nd method of class A");
	}
}

class Bb extends Aa{
	@Override
	public void meth2() {
		System.out.println("2nd method of class B");
	}
	
	public void meth3() {
		System.out.println("3rd method");
	}
	
}


public class _17MethodOverriding {

	public static void main(String[] args) {

		Aa obj=new Aa();
		obj.meth2();
		
		Bb obj1=new Bb();
		obj1.meth2();
		
					//Dynamic dispatch
		Aa obj2 = new Bb();
		obj2.meth2();
	}

}
