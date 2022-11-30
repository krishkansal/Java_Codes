package Array_DS;

public class Practice {
//	public void array() {
//	int[] arr= {1,2,3,4,5};
//	print(arr);
//	}
	
	
//	public static int[] remove_even(int[] arr) {
//		int oddcount=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2!=0) {
//				oddcount++;
//			}
//		}
//	int[] result=new int[oddcount];
//	int index=0;
//	for(int i=0;i<arr.length;i++) {
//		if(arr[i]%2!=0) {
//			result[index]=arr[i];
//			index++;
//		}
//	}
//	return result;
//	}

//	public static void reverse(int[] arr , int start,int end) {
//		while(start<end) {
//			int temp=arr[start];
//			arr[start]=arr[end];
//			arr[end]=temp;
//			start++;
//			end--;
//		}
//	}
	
	
//	public static int minimum(int[] arr) {
//		if(arr==null) {
//		}
//		int min=arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]<min) {
//				min=arr[i];
//			}
//		}
//		return min;
//	}
	
//	public static int secmax(int[] arr) {
//		int max=Integer.MIN_VALUE;
//		int second_Max=Integer.MIN_VALUE;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				second_Max=max;
//				max=arr[i];
//			}else if(arr[i]>second_Max && arr[i]!=max) {
//				second_Max=arr[i];
//			}
//		}	return second_Max;
//	}
	
	
//	public static void movezeros(int[] arr) {
//		int j =0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=0 && arr[j]==0) {
//				int temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//			}if(arr[j]!=0) {
//				j++;
//			}
//		}
//	}
	
//	
//	public static int[] resize(int[] arr,int capacity) {
//		int[] temp=new int[capacity];
//		for(int i=0;i<arr.length;i++) {
//			temp[i]=arr[i];
//		}
//		arr=temp;
//		return arr;
//	}
	
	public static int findmissing(int[] arr) {
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		for(int num:arr) {
			sum=sum-num;
		}
		return sum;
	}
	
	
	public static void print(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
	}	

	public static void main(String[] args) {
		int[] arr= {1,2,3,5};
		System.out.println(findmissing(arr));
		
		
		
		
		
		//		Practice pr=new Practice();
//		int[] arr= {3,2,0,0,10,6,5};
//		System.out.println(arr.length);
//		arr=resize(arr,10);
//		System.out.println(arr.length);
		
		
		//		movezeros(arr);
//		print(arr);
		
		
		//		int[] arr= {3,2,4,7,10,6,5};
//		reverse(arr,0,arr.length-1);
//		print(arr);
		
		
		
		//		int[] arr= {3,2,4,7,10,6,5};
//		print(arr);
//		System.out.println();
//		int[] result=remove_even(arr);
//		print(result);
		
		
//		Practice arr=new Practice();
//		arr.array();
	}
	}

