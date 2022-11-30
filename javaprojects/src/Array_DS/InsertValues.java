package Array_DS;

public class InsertValues {
	int arr[]=null;
	public InsertValues (int size) {
		arr=new int [size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.MIN_VALUE;
			
		}
	}
	
	public void Insert(int idx,int value) {
		if(arr[idx]==Integer.MIN_VALUE) {
			arr[idx]=value;
			System.out.println("Successfully inserted");
		}else {
			System.out.println("This cell is already occupied");
		}
	}

	
	public static void main(String[] args) {
		InsertValues I=new InsertValues(5);
		
		I.Insert(0, 0);
		I.Insert(1, 4);
		I.Insert(2, 5);		
		I.Insert(5, 5);		
	}

}
