package Array;

public class Min_Max_Element {

	public static void main(String[] args) {
		

		 int arr[]={1,2,3,12,5};
		 int n=5;
		 int min=100000;
		    
		   for(int i=0;i<n-1;i++)
		   {
		      if((arr[i]>arr[i+1]))
		     {
		         System.out.println("Max element : " +arr[i]);
		     }
		      if(arr[i]<min) {
					 min=arr[i];
					 System.out.println("Min element : " +min);
				 }
		     }
	}

}
