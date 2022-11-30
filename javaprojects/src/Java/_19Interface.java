package Java;

interface Bicycle{                            	//Methods
	int a=45;
	void applybreak(int decrease);
	void speedup(int increase);
	void BlowHorn();
	void BlowHorn1();
}

class Ayon implements Bicycle{				//body = Methods define
	 public void applybreak(int decrease) {
		System.out.println("Break");
	}
	 public void speedup(int increase) {
		 System.out.println("Speed");
	}
	 public void BlowHorn() {
		 System.out.println("Pee Pee Pee");
	 }
	 public void BlowHorn1() {
		 System.out.println("Poo Poo Poo");
	 }
}


public class _19Interface {
	public static void main(String[] args) {
		Ayon obj = new Ayon();
		obj.applybreak(1);
		obj.speedup(1);
		obj.BlowHorn();
		obj.BlowHorn1();
		System.out.println(obj.a);
	}

}
