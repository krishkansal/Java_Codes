package Java;

class Employes{
	private int id;
	private String name;
	
	public Employes(String myName , int myId) {
		id=myId;
		name=myName;
	}
	
	public String getName() {
		return name;
		}
	
	public void setName(String n) { 
		name=n;
	}
	
	public void setId(int i) {
		id=i;     //this.
		}
	
	public int getId() {
		return id;
		}
	
}


public class _14Constructors {

	public static void main(String[] args) {

		Employes obj = new Employes( myName: "deepak", myId:45);
		//obj.setName("Krish");
		//obj.setId(12);
		
		System.out.println(obj.getName());
		System.out.println(obj.getId());
	}

}
