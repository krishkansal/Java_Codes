package Array_DS;

public class Adding_Value {

	public void arraydemo() {
		int [] myArray =new int[5];
		myArray[0]=5;
		myArray[1]=1;
		myArray[2]=3;
		myArray[3]=4;
		myArray[4]=7;
		printArray(myArray);
	}

public void printArray(int[] arr) {
	int n=arr.length;
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
}


	public static void main(String[] args) {
		
		Adding_Value arr=new Adding_Value();
		arr.arraydemo();
		
	}

}

