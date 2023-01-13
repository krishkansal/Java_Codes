package Sorting;

public class Bubble_Sort {
	
	public void sort(int arr []) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	
	void print(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Bubble_Sort bs=new Bubble_Sort();
		int a[]= {2,1,8,-3,6,4,12};
		
		
		bs.print(a);
		bs.sort(a);
		bs.print(a);
	}

}
