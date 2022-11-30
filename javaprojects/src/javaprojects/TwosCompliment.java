package javaprojects;

public class TwosCompliment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,0,1,0};
		//First Compliment
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				arr[i]=1;
			}else {
				arr[i]=0;
			}System.out.print(arr[i]);
			
			}
		System.out.println();
		//Second Compliment
		arr[arr.length-1]+=1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]==2) {
				arr[i]=0;
				arr[i-1]+=1;
			}	
			System.out.print(arr[i]);
		}
	}

}
