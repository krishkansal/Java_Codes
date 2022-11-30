package Array2D_DS;

import java.util.Arrays;

public class Initialize_values {

	public static void main(String[] args) {

		int [] [] Array= new int [2][2];
		Array[0][0]=1;
		Array[0][1]=2;
		Array[1][0]=3;
		Array[1][1]=4;
		System.out.println(Arrays.deepToString(Array));
		
		String s[][] = {{"a","b"},{"c","d"}};
		System.out.println(Arrays.deepToString(s));
	}

}
