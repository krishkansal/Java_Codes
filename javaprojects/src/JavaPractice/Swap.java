package JavaPractice;

class Dog{
	int legs;
}
public class Swap {

	static void swap(Dog a,Dog b) {
		Dog temp =a;
		a=b;
		b=temp;
	}
	
	static void swap(int a,int b) {
		int temp =a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
		//pass by value
	}
	
	public static void main(String[] args) {
	 int c=34;
	 int d=12;
	 swap(c,d);
	System.out.println(c+" "+d);
	
	
	Dog e=new Dog();
	Dog f=new Dog();
	f.legs=3;
	e.legs=4;
	swap(e,f);
	System.out.println(e.legs+" "+f.legs);
	
	}
}
