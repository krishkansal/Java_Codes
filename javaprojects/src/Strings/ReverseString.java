package Strings;

public class ReverseString {

	public static String reverseString(String str) {
		String reverse=" ";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		return reverse;
		
	}
	public static void main(String[] args) {
		String str="abba";
		String reverseit=reverseString(str);
		System.out.print(reverseit);
		System.out.println();
		
		if(reverseit == str) {
			System.out.print("true");
		}else {
			System.out.print("false");
		}
	}

}
