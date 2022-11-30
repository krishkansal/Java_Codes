package Array_DS;

import java.util.Arrays;

public class DeleteElement {

	public static int[] remove(int [] arr,int index) {
		if(arr==null || index<0 || index>=arr.length) {
			return arr;
		}
		int [] newArray = new int [arr.length-1] ;
			for(int i=0, k=0 ; i<arr.length;i++) {
				if(i==index) {
					continue;
				}
				newArray[k++]=arr[i];
			}
			return newArray;
		
	}
	public static void main(String[] args) {

		int [] arr= {1,2,3,4,5};
		
		 System.out.println("Original Array: "+ Arrays.toString(arr));
		
		arr=remove(arr,1);
	
		System.out.println("Resultant Array: "+ Arrays.toString(arr));
	}

}
