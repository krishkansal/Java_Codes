package Java;

public class Array1 {

	public static void main(String[] args) {

		// classroom of 500 students---store marks
	/*	int [] marks = new int[5]; //{100,60,90,80,50,100}
		marks[0]=100;
		marks[1]=60;
		marks[2]=90;
		marks[3]=80;
		marks[4]=50;
		marks[4]=100;
		System.out.println(marks[4]);
	*/
		
		int [] marks ={100,60,90,80,50,100};
		float [] marks1 ={100.5f,60.2f,90.0f,80.9f,50.5f,100.0f};
		String [] Student ={"krish","deepak"};
		
		System.out.println(Student.length);
		System.out.println(Student[0]);
		System.out.println(marks.length);
		System.out.println(marks[0]);
		
		
		
				//with for loop
		
		//for(int i=0;i<marks.length;i++) {
			//System.out.println(marks[i]);
		//}

		
				//reverse order
	
		//for(int i=marks.length-1;i>=0;i--) {
			//System.out.println(marks[i]);
		//}
		
				
				//For-each loop
		
		for(int element:marks) {
			System.out.println(element);
		}
	}

}
