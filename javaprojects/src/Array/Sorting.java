package Array;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
	int arr[]= {2,5,1,6,8,9};
	int n=arr.length;
	for(int i=0;i<n-1;i++) {
		for(int j=0;j<n-1;j++) {
			if(arr[j+1]<arr[j]) {
				int temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(int a=0;a<n;a++) {
		System.out.print(" "+ arr[a]);
		System.out.println();
		
	}
	int b=s.nextInt();
	System.out.println("Kth smallest element : "+arr[b-1]);
	System.out.println();
	for(int k=n-1;k>0;k--) {
	//	System.out.println(arr[k]);
		//int c=s.nextInt();
		//System.out.println("Kth smallest element : "+arr[c]);
	}int c=s.nextInt();
	System.out.println("Kth Largest element : "+arr[c]);
	
	
	
	}

}
