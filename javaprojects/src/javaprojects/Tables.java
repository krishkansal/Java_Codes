package javaprojects;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); 
		int n = s.nextInt();
    	int i=1;
    	while(i<=10) { 
    		System.out.println(n+" x "+i+" = "+n*i);
    		i++;
    	}
	}

}
