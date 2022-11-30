package JavaPractice;

import java.util.Arrays;

public class Two_pointer_algo {
	public static void main(String[] args) {
		int a[]= {-1,4,6,2,1};
		Arrays.sort(a);
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		int x=5;
		
		int i=0;
		int j=a.length-1;
		while(i<j) {
			if (a[i]+a[j]>x) {
				j--;
			}else if (a[i]+a[j]<x){
				i++;
			}else {
				//System.out.println(a[i]);
			//	System.out.println(a[j]);
			}
		}
	//	System.out.println("False");
		
	}
	

}
