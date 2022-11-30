package Array;

public class sub_array {

	public static void main(String[] args) {

		int arr[]= {1,2,3,7,5};
		int n=arr.length;
		int sum=12;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
		
	}

}
