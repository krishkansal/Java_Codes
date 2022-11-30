package Array;

import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {

		int a[]= {5,6,2,8,9};
		int c[]= {};
		Arrays.fill(c,1);
		int n=a.length;
		for(int i=0;i<n-1;i++) {
		for(int j=1;i<a.length;i++) {
			if(a[j]>a[j-1]) {
				c[j]=c[j-1]+1;
			}
		}
			}
		for(int e:c) {
			System.out.print(e+" ");
		}
	}

}
