package Array2D_DS;

import java.util.Scanner;

public class RotateMatrix {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			
			int [][] arr= new int[n][n];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					arr[i][j]=s.nextInt();
				}
			}
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					int temp=arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i]=temp;
				}
			}
			
			for(int i=0;i<arr.length;i++) {
				int first=0;
				int last=arr[i].length-1;
				while(first<last) {
					int temp=arr[i][first];
					arr[i][first]=arr[i][last];
					arr[i][last]=temp;
					first++;
					last--;
					
				}
			}
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		
	}

}
