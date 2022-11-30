package javaprojects;

import java.util.ArrayList;
import java.util.Collection;

	class Bike{
		
	}
class Factory{
	ArrayList al=new ArrayList();
	Collection order(int item) {
		for(int i=0;i<item;i++) {
			Bike objBike=new Bike();
			al.add(objBike);
		}
		return al;
	}
}
public class Bikesorder {
	

	public static void main(String[] args) {
		Factory objF =new Factory();
		Collection col = objF.order(10);
		System.out.println(col);
	}

}
