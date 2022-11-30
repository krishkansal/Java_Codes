package Strings;
import java.util.ArrayList;
public class Collection_01 {
	public Collection_01() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
		int a=15;
		Integer i=new Integer(10);  
		Character ch=new Character('c');   
		Double d=new Double(10.5);     
		double dd=28.7;  
	
	
	a1.add(i);
	a1.add(ch);
	a1.add(d);
	a1.add(100);
	a1.add(dd);
	a1.add(null);
	a1.add(a);
	System.out.println(a1);
	}

}
