package javaprojects;

public class SumofMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]sum=new int[3][3];
		int[][] a = {{2,3,4},{5,6,7},{8,9,10}};
		int[][] b = {{11,12,13},{14,15,16},{17,18,19}};
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
