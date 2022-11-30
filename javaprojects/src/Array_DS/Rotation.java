package Array_DS;

public class Rotation {
	public static void Rotation(int [] arr , int d ) {
		int n=arr.length;
		int temp [] = new int [n];
		int k=0;
		for(int i=d;i<n;i++) {
			temp[k]=arr[i];
			k++;
		}
		for(int i=0;i<d;i++) {
			temp[k]=arr[i];
			k++;
		}
		for(int i=0;i<n;i++) {
			arr[i]=temp[i];
		}
	}
	
	public static void Print(int [] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {

		int [] arr= {1,2,3,4,5};
		Print(arr);
		System.out.println();
		Rotation(arr,2);
		Print(arr);
	}

}
