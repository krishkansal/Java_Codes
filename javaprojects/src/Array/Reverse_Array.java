package Array;

public class Reverse_Array {

	public static void main(String[] args) {

		 int arr[]={1,2,3,12,5};
		 int n=arr.length;
		 int a[]=new int[n];
		 for(int i=0;i<n;i++) {
			 a[i]=arr[n-i-1];
		 }
		 for(int i=0;i<n;i++) {
			  System.out.print(a[i]+" ");

		 }

}
}
