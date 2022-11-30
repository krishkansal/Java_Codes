package Array_DS;

public class last_secondLast {

	public static void main(String[] args) {
		 int arr[] = {2, 5, 14, 1, 26, 65, 123, 6};
		 int first=Integer.MIN_VALUE;
		 int second=Integer.MIN_VALUE;
		 
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]>first) {
				 second=first;
				 first=arr[i];
			 }else if(arr[i]>second) {
				 second=arr[i];
			 }
		 }
		 System.out.println("First : "+first+" second : "+second);
		
	}

}
