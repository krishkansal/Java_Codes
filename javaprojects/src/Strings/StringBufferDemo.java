package Strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer buffer= new StringBuffer("Hello");
		System.out.println(buffer.append("  Student"));
		
		System.out.println(buffer.insert(6,"BE"));
		System.out.println(buffer.insert(7,"."));
		System.out.println(buffer.delete(6,9));
		System.out.println(buffer.replace(7,14,"class"));
		System.out.println(buffer.substring(5));
		System.out.println(buffer.reverse());
		System.out.println(buffer.capacity());
		System.out.println(buffer.length());
	}

}
