package Strings;

public class Practice1 {

	public static void main(String[] args) {
		String s="Name of the university is Chitkara University";
//		s=s.toLowerCase();
		int[] arr=new int[s.length()];
		for (int i=0; i<s.length();i++) {
			String s1 = Character.toString(s.charAt(i));
			int x=s.indexOf(s1);
			arr[x]+=1;
			
		}
		for(int i=0; i<arr.length;i++) {
			if (arr[i]==1) {
				System.out.println(s.charAt(i));
				
			}
		}
	}

}
