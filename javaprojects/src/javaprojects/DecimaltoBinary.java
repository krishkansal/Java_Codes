package javaprojects;

public class DecimaltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.print("Decimal Number: "+n);
		int rem=0;
		int p=0;
		int r=0;
		
		while(n>0) {
			rem=n%2;
			r=r+rem*(int)Math.pow(10,p++);
			n=n/2;
		}System.out.println();
		System.out.print("Binary Number: "+r);
		System.out.println();
		
		
		int[] arr = {1,0,1,0};
		//First Compliment
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				arr[i]=1;
			}else {
				arr[i]=0;
			}
			System.out.print(arr[i]);
			
			}
		System.out.println();
		//Second Compliment
		arr[arr.length-1]+=1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]==2) {
				arr[i]=0;
				arr[i-1]+=1;
			}//else if(arr[i]==1) {
				//arr[i]=1;
				//arr[i-1]+=1;	
		System.out.print(arr[i]);
		}
	}

}
