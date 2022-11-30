package Array;

public class Reverse_ {

	public static void main(String[] args) {

		int arr[]= {1,2,3,5,6,8};
		int n=arr.length;
		int temp;
		int i=0;
		while(i<n-i-1) {
				temp=arr[i];
				arr[i]=arr[n-i-1];
				arr[n-i-1]=temp;
				i++;
				
			}
		for(int a=0;a<n;a++) {
			System.out.print(arr[a]+" ");
		}
		
	}

}
