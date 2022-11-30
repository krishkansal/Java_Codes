package Array;

public class Frequency {

	public static void main(String[] args) {

		int arr[]= {1,1,1,1};
		int n=arr.length;
		int count=0;
		int x=1;
		for(int i=0;i<n;i++) {
			if(arr[i]==x) {
				count++;
			}
		}System.out.println(count);
	}
}
