package Array_DS;

public class Second_Max {
	public static int secondmax(int[]arr) {
		int max=Integer.MIN_VALUE;
		int second_max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				second_max=max;
				max=arr[i];
			}
			else if(arr[i]>second_max && arr[i]!=max) {
				second_max=arr[i];
			}
		}
		return second_max;
	}

	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void main(String[] args) {
		int[]arr= {0,1,12,12};
		//Second_Max sm=new Second_Max();
		System.out.println(secondmax(arr));
		
	}

}
