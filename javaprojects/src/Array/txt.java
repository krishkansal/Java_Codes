package Array;

public class txt {

	public  void main(String[] args) {
		System.out.println(findSum(5));
	
	}
	public int findSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		return sum;
		
	}

}
