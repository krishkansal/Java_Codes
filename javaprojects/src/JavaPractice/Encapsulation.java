package JavaPractice;

public class Encapsulation {

	public static void main(String[] args) {

		GETTER_SETTER obj = new GETTER_SETTER();
		obj.name="Krish";
		//obj.age=20;
		obj.setAge(50);
		System.out.println(obj.getAge());
	
	}

}
