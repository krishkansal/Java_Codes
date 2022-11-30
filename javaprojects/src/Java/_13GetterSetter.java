package Java;

class MyEmploye{
	private int id;
	private String name;
	
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
public class _13GetterSetter {

	public static void main(String[] args) {
		
		MyEmploye obj = new MyEmploye();
		//obj.id=20;
		//obj.name="deepak";
		//System.out.println(obj.id);
		//System.out.println(obj.name);
		
		obj.setName("Krish");
		System.out.println(obj.getName());
		
		obj.setId(12);
		System.out.println(obj.getId());
		
		
	}

}
