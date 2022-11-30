package Inheritance;

public class Vehicleuse {

	public static void main(String[] args) {
		Vehicle v =new Vehicle();
		v.color="red";
		v.maxspeed=300;
		v.print();
		System.out.println();
		Car c = new Car();
		c.color="Black";
		c.maxspeed=300;
		c.tyres=4;
		c.print();
		

	}

}
