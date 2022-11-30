2package Array_DS;

public class FindPairSum {
	
	public static void Pair(int [] arr,int sum) {
		int n=arr.length-1;
		
		int low=0;
		int high = n;
		while(low<high) {
			if(arr[low]+arr[high]>sum) {
				high--;
			}
			else if(arr[low]+arr[high]<sum) {
				low++;
			}
			else if(arr[low]+arr[high]==sum) {
				System.out.println("Pair("+ arr[low]+ ", " + arr[high]+")");
				low++;
				high--;
			}
		}
	}

	public static void main(String[] args) {
		int [] arr= {11,12,1,8,5};
		Pair(arr,6);
	}

}
