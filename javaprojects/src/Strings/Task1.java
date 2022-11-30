package Strings;

public class Task1 {

	public static void main(String[] args) {

		String str="Chitkara School";
		String subs="School";
		int a=str.indexOf("School");
		if (a!=-1) {
			String str1=str.replace("School", "University");
			System.out.println(str1);
			
		}
		
		String s= "OOPS OOPS OOPS";
		String s1=s.replaceAll("OOPS", "Java");
		System.out.println(s1);
	}

}
