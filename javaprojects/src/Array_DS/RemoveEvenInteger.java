package Array_DS;

public class RemoveEvenInteger {
	public static int[] removeeven(int[]arr) {
		int oddcount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				oddcount++;
			}
		}
		int[]result=new int[oddcount];
		int idx=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				result[idx]=arr[i];
				idx++;
			}
		}
		return result;
	}

public static void printArray(int[] arr) {
	int n=arr.length;
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}

}
public static void main(String[] args) {
	int[]arr= {3,2,4,7,10,6,5};
	printArray(arr);
	System.out.println();
	int[]result=removeeven(arr);
	printArray(result);
	
	}

}
