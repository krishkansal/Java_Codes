package Strings;

public class StringBuilderDemo {

	public static void main(String[] args) {

		StringBuilder str1 = new StringBuilder(10);
		System.out.println(str1.capacity());
		
		StringBuilder str2 = new StringBuilder("AAABBBCCC");
		System.out.println(str2.capacity());
	}

}
