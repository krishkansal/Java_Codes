package Array;

public class zero_one_Sorting {

	public static void main(String[] args) {


		int arr[]= {5,0,5,1,0,2,0,5};
		int n=arr.length;
		int zero=0;
		int one=0;
		int two=0;
		int temp;
		for(int i=0;i<n-1;i++) {
			if(arr[i]==0) {
				temp=arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=temp;
				System.out.println(temp);
			
			}else if(arr[i]==1) {
				temp=arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=temp;
				System.out.println(temp);
		}
		}
		
		
		
	}
}
