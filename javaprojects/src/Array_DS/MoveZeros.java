package Array_DS;

public class MoveZeros {
	public static void movezero(int[]arr) {
		int n=arr.length;
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0 && arr[j]==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j]!=0) {
				j++;
			}
		}
	}
	
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void main(String[] args) {
	
		int[] arr= {0,1,0,4,12};
		printArray(arr);
		System.out.println();
		movezero(arr);
		printArray(arr);
		
	}
}
