package Java;

 class Employe{
	 	int id;
		String name;
		int salary;
		
		public void printdetails() {
	 		System.out.println("id = "+id);
	 		System.out.println("name = "+name);
	 		System.out.println("salary = "+salary);
	 	}
		public int getSalary() {
			return salary;
		}
}
 	


public class _11CoustomClass {

	public static void main(String[] args) {

		Employe obj1=new Employe();
		Employe obj2=new Employe();
		obj1.id=12;
		obj1.name="Krish";
		obj1.salary=1500;
		//System.out.println(obj.id);
		//System.out.println(obj.name);
		obj1.printdetails();
		
		obj2.id=13;
		obj2.name="Deepak";
		obj2.salary=2500;
		obj2.printdetails();
		
		int salary=obj2.getSalary();
		System.out.println(salary);
		
	}

}
