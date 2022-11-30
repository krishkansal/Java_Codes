package Strings;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {

		StringTokenizer ob = new StringTokenizer("Hello class ");
		while(ob.hasMoreTokens()) {
			System.out.println("-->"+ob.nextToken());
			
		}
		
	}

}
