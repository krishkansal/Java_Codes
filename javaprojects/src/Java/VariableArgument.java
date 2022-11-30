package Java;

public class VariableArgument {
					//Method 1
	
	static int sum(int a ,int b) {
		
		return a+b;
	}
					//Method 2
	
static int sum(int a ,int b,int c) {
		
		return a+b+c;
	}

					//Method 3

static int sum(int ...arr) {
	
	int result=0;
	for(int a:arr) {
		result+=a;
		
	}
	return result;
}

	public static void main(String[] args) {
		
		System.out.println(sum(1,2,4,5,6,2));
		
		
		
		
		
		
		
	}

}
