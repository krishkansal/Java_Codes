package javaprojects;

import java.util.Scanner;

public class New3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
    	 int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    	 System.out.print("Enter the number: ");
 	     int n = s.nextInt();
 	     
 	     for(int i = 0 ; i < arr.length;i++) {
 	    	 if(arr[i]==n) {
 	    		System.out.println(i); 
 	    	 }
 	    	
 	     }
	}

}
