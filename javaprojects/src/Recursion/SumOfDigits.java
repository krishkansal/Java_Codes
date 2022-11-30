package Recursion;

public class SumOfDigits {
		public int sum(int n) {
			if(n==0 || n<0) {
				return 0;
			}
			return sum(n/10)+ n%10;
		}
	
	public static void main(String[] args) {
		SumOfDigits s=new SumOfDigits();
		System.out.println(s.sum(11));
	}

}
