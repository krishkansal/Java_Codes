package JavaPractice;

import java.util.Scanner;

public class GETTER_SETTER {
	
	int age;
	String name;
	
	public int getAge(){
		return age;
		
	}
	
	public void setAge(int age) {
		if(age>15) {
			System.out.println("you r perfect");
		}
		this.age=age;
	}
	}


