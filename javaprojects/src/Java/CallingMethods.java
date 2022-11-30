package Java;

public class CallingMethods {
	 int Add(int x,int y) {
		int z;
		if(x>y) {
			z=x+y;
		}else {
			z=(x-y);
		}
		return z;
	}

	public static void main(String[] args) {
		
		//Dry Do not repeat
		int x=10;
		int y=6;
		int c;
		c=Add(x,y);
		System.out.println(c);
		
		CallingMethods obj=new CallingMethods();  //remove Static
		c=obj.Add(x,y);
		System.out.println(c);
		
		
	}

}
