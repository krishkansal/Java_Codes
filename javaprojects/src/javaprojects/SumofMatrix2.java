package javaprojects;

import java.util.Scanner;

public class SumofMatrix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] Sum= new int[2][2];
		int[][] a = {{1,2},{2,3}};
		int[][] b = {{2,1},{3,2}};
		System.out.println("Matrix 1");
		for(int i=0;i<2;++i) {
			for(int j = 0;j<2;++j) {
				
				System.out.print(a[i][j]+"  ");	
			}System.out.println();
		}
		System.out.println("Matrix 2");
		for(int i=0;i<2;++i) {
			for(int j = 0;j<2;++j) {
				
				System.out.print(b[i][j]+"  ");	
			}System.out.println();
		}
		
		
		System.out.println("Sum : ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				Sum[i][j]=a[i][j]+b[i][j];
				
				System.out.print(Sum[i][j]+"  ");
				
			}System.out.println();
		}
	}

}







/*public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner s =new Scanner(System.in);
	int lar=Integer.MIN_VALUE;
	int sum=0;
	int n=s.nextInt();
	int[]arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();

	}for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}	
	for(int i=0;i<n;i++) {
		sum=sum+arr[i];
		System.out.println();
	}System.out.print(sum);
	
	System.out.println();
	for(int i=0;i<n;i++) {
		if(arr[i]>lar) {
			lar=arr[i];
		}
	}System.out.println(lar);
	int a=s.nextInt();
	for(int i=0;i<n;i++) {
		if(arr[a]==arr[i]) {
			System.out.println(arr[i]);
		}
		
	}
	
}

}*/

