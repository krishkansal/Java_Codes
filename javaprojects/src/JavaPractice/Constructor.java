package JavaPractice;

class Vehicle{
	int wheels;
	int headlights;
	String color;

	Vehicle(int wheels){
		this.wheels=wheels;
		headlights=2;
	}
	Vehicle(int wheels,String color){
		this.wheels=wheels;
		this.color=color;
		headlights=2;
	}
}
public class Constructor {
	Constructor(){
		System.out.println("object is now created");
	}
	public static void main(String[] args) {
	
		Vehicle car=new Vehicle(4,"red");
		Vehicle car1=new Vehicle(2);

		//car.wheels=4;
		System.out.println(car.wheels+" "+car.color+" "+car.headlights);
		System.out.println(car1.wheels+" "+car1.headlights);
		
	}
}

