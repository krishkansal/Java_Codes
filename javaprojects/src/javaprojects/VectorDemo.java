package javaprojects;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector objV=new Vector(4,3);
		objV.addElement(1);
		objV.addElement(2);
		
		System.out.println(objV.firstElement());
		System.out.println(objV.remove(objV.size()-2));
		System.out.println(objV.size());
	}

}
