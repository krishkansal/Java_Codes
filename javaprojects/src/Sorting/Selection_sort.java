package Sorting;

public class Selection_sort {
	
	
	 public static void selectionSort(int[] arr){  
	        for (int j=0;j<arr.length-1;j++)  
	        {  
	            int minimumIndex=j;  
	            for (int i=j+1;i<arr.length;i++){  
	                if(arr[i]<arr[minimumIndex]){  
	                    minimumIndex=i; 
	                }  
	            }  
	            if(minimumIndex!=j) {
	            	int temp=arr[j];
	            	arr[j]=arr[minimumIndex];
	            	arr[minimumIndex]=temp;
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
		Selection_sort ss = new Selection_sort();
		 int a [] = {5,7,4,9,1};
		 
		 ss.print(a);
		 ss.selectionSort(a);
		 ss.print(a);
		 
		
	}

}
