package Array2D_DS;

public class removeDuplicates {

	public static void main(String[] args) {

		int [] arr= {1,1,2,2,3,4,5};
		int n=arr.length;
		int [] temp=new int[arr.length];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j]=arr[n-1];
		for(int i=0;i<temp.length;i++) {
			System.out.print(temp[i]+" ");
		}
	}

}
