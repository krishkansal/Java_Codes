package javaprojects;
import java.util.Scanner;
public class New5 {
	public static void main(String[] args) {
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

}
