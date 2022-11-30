package Array_DS;

public class Resize {

	public int[] resize(int [] arr,int capacity) {
		int [] temp = new int [capacity];
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		arr=temp;
		return arr;
	}
	public static void main(String[] args) {
		Resize re=new Resize();
		int [] arr = {5,9,3,10};
		System.out.println("size of original is : "+ arr.length);
		arr=re.resize(arr, 10);
		System.out.println("size of updated is : "+arr.length);
		
	}

}
