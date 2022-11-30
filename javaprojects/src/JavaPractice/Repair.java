package JavaPractice;

public class Repair {


	public static void repairCar(Car car) {
		System.out.println("car is repaired");
		
	}

	public static void main(String[] args) {
		
		Wagnor w=new Wagnor();
		Audi A=new Audi();
		
		repairCar(w);
		repairCar(A);
		
}
}
