package Sorting;

public class Insertion_Sort {
	
	public void sort(int arr []) {
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i;
			while(j>0 && arr[j-1]>temp) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
		
	}
	
	void print(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}


	public static void main(String[] args) {
		Insertion_Sort is=new Insertion_Sort();
		int a [] = {5,3,4,7,2,9};
		
		is.print(a);
		is.sort(a);
		is.print(a);
		
	}

}
