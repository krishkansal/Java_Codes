package Inheritance;

interface interfaceVehicles {
	void changeGear(int newGear) ;
	void speedup(int increment);
	void applyBrakes(int decrement);
	void print();
	
}
class Bicycle implements interfaceVehicles{
	int speed; 
	int gear;
	
	public void changeGear(int newGear) {
		gear=newGear;
		
	}
	public void speedup(int increment) {
		speed =speed+increment;
	}
	public void applyBrakes(int decrement) {
		speed =speed-decrement;
	}
	public void print() {
		System.out.println("Speed "+ speed);
		System.out.println("Gear " + gear);
		
	}
	
}
class Bikes implements interfaceVehicles{
	
	int speed; 
	int gear;
	
	public void changeGear(int newGear) {
		gear=newGear;
		
	}
	public void speedup(int increment) {
		speed =speed+increment;
	}
	public void applyBrakes(int decrement) {
		speed =speed-decrement;
	}
	public void print() {
		System.out.println("Speed "+ speed);
		System.out.println("Gear " + gear);
		
	}
}
class Car implements interfaceVehicles{
	int speed; 
	int gear;
	private static boolean AC=true;
	static void AC() {
		System.out.println("AC :"+AC);
	}
	
	public void changeGear(int newGear) {
		gear=newGear;
		
	}
	public void speedup(int increment) {
		speed =speed+increment;
	}
	public void applyBrakes(int decrement) {
		speed =speed-decrement;
	}
	public void print() {
		System.out.println("Speed "+ speed);
		System.out.println("Gear " + gear);
		
	}
	
}



public class Q7 {

	public static void main(String[] args) {
		interfaceVehicles veh= new Bicycle();
		veh.changeGear(2);
		veh.speedup(3);
		veh.applyBrakes(1);
		veh.print();
		
		Car.AC();
	}

}
