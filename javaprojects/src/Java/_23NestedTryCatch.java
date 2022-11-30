package Java;

public class _23NestedTryCatch {

	public static void main(String[] args) {
		int a=6000;
		int b=0;
		
		try {
			System.out.println("Welcome ");
			try {
				int c=a/b;	
				System.out.println("result :"+c);
			}
			catch(Exception e){
				System.out.println("We failed to divide. Reason : ");
				System.out.println(e);
			}
		}
		catch(Exception e) {
			System.out.println("Exception in Level 1 ");
		}
		System.out.println("End of the program");
	} 

}
