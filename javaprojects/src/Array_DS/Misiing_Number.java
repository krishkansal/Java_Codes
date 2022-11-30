package Array_DS;

public class Misiing_Number {

	public int MissingNumber(int[] arr) {
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		for(int num:arr) {
			sum=sum-num;
		}
		return sum;
	}
	public static void main(String[] args) {
		Misiing_Number number = new Misiing_Number();
		int [] arr = {1,2,3,5};
		System.out.println(number.MissingNumber(arr));
	}

}
