package Interface;

public class Person implements Student , Youtuber{

	@Override
	public void study() {
		System.out.println("is studying");
	}

	@Override
	public void makevideo() {
		System.out.println("is making a good video");
	}
	public static void main(String[] args) {
		Person obj=new Person();
		obj.study();
		obj.makevideo();
		
		
	}
	
}
	


