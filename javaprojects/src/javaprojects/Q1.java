package javaprojects;
public class Q1 {
	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User();
		System.out.println("Object Number "+user1.getObjNo());
		System.out.println("Object Number "+user2.getObjNo());
		System.out.println("Total number of objects created " + user2.getCountNo());

	}
	
	public static class User{
		
		static int count=0;
		int id;
		
		public User(){
			count = count + 1;
			id=count;
		}
		public int getObjNo() {
			return id;
		}
		
		public int getCountNo() {
			return count;
		}
		
}
}