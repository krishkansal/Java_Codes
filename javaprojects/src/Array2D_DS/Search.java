package Array2D_DS;

import java.util.Scanner;

public class Search {
	public static void searching(int[][] arr,int key) {
	int n=arr.length;
	int m=arr[0].length;
	boolean flag=false;
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			if(arr[i][j]==key) {
				System.out.println("Found at index : "+i+" "+j);
				flag=true;
				break;
				}
			}
		}
	if(flag==false) {
			System.out.println("not found");
	}
}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of row");
		int n=s.nextInt();
		System.out.println("enter the size of col");
		int m=s.nextInt();
		int arr[][]=new int [n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=s.nextInt();
				
			}
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]);
			}
		}
		searching(arr,3);
		
	}

}
