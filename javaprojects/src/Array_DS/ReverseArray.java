package Array_DS;

public class ReverseArray {
	public static void reverse(int[]number,int start,int end) {
		while(start<end) {
			int temp=number[start];
			number[start]=number[end];
			number[end]=temp;
			start++;
			end--;
		}
	}
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void main(String[] args) {
		int[]number= {2,3,4,5,6};
		reverse(number,0,number.length-1);
		printArray(number);
		
	}

}
