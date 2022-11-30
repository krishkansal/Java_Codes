package Array2D_DS;

import java.util.Scanner;

public class AvgTemperature {

	public static void main(String[] args) {

		
		Scanner s= new Scanner(System.in);
		System.out.println("How many days temperatures ? ");
		int num = s.nextInt();
		int [] arr=new int[num];
		int sum=0;
		for(int i=0;i<num;i++) {
			System.out.print("Days" + (i+1) + "'s hight temp: ");
			arr[i]=s.nextInt();
			sum+=arr[i];
		}
		double average = sum/num;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>average) {
				count++;
			}
		}
		System.out.println();
		System.out.println("Average Temp = " +average);
		System.out.println(count + " days above temperature");
		
	}

}
