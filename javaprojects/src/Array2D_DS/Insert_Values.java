package Array2D_DS;

import java.util.Scanner;

public class Insert_Values {
	
	public static void Array(int row,int col) {
	     int twodarray[][]=new int [row][col];
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the elements: ");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				twodarray[i][j]=s1.nextInt();
			}
			System.out.println();
		}
		System.out.println("your output is: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(twodarray[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
	public static void search(int arr[][],int value) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;i<arr[0].length;j++) {
				if(arr[i][j]==value) {
					System.out.println("fount at"+" row: "+i+" col:"+j);
				}
			}
			
		}
		System.out.println("not found");
	}

	
	public static void main(String[] args) {
		
		//Array(3,2);
		int arr[][] = {{1,2,3},
						{4,5,6}};
		search(arr,5);
	}

}
