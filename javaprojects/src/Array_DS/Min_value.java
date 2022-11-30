package Array_DS;

public class Min_value {
	public static void findmin(int[]arr) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				
			}
		}
		System.out.println( min);
	}
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}


	public static void main(String[] args) {

		int[]arr= {2,5,3,1,4};
		
		findmin(arr);
		
	}

}
