package Array2D_DS;

import java.util.Arrays;

public class PairSum {

	public int[] twoSum(int [] arrr,int target) {
		for(int i=0;i<arrr.length;i++) {
			for(int j=i+1;j<arrr.length;j++) {
				if(arrr[i]+arrr[j]==target) {
					return new int [] {i,j};
				}
			}
		}
		return arrr;
	}
	public static void main(String[] args) {
		PairSum ps=new PairSum();
		int [] arr= {1,2,4,6};
		int [] result=ps.twoSum(arr, 5);
		System.out.println(Arrays.toString(result));
		
	}

}
