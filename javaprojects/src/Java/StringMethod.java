package Java;

import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) {      //Function
		Scanner s=new Scanner(System.in);
		String name="krish kansal";
		System.out.println(name);
									//Methods
		int value=name.length();
		System.out.println(value);
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.trim());
		System.out.println(name.substring(5));
		System.out.println(name.substring(4,6));
		System.out.println(name.replace('k','d'));
		
		//name=name.replaceAll("krish", "deepak");
		//System.out.println(name);
		
		System.out.println(name.startsWith("k"));
		System.out.println(name.endsWith("sal"));
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf('k'));
		System.out.println(name.indexOf("k",4));
		System.out.println(name.indexOf("q",4));
		System.out.println(name.lastIndexOf('k'));
		System.out.println(name.equals("krish kansal"));
		System.out.println(name.equalsIgnoreCase("KrIsh Kansal"));
		
		//Problems
		
		String letter="Dear <|name|>, Thanks a lot";
		letter=letter.replace("<|name|>","Harry");
		System.out.println(letter);
		
		System.out.println(letter.indexOf(" "));
		
		String letter2="Dear Krish,\n\t Thanks a lot!";
		System.out.println(letter2);
		
	}
}