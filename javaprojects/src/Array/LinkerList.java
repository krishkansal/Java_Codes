package Array;

import java.util.*;

public class LinkerList {

	public static void main(String[] args) {

		List<Integer> ll = new List<>();
		//List<Integer> al = new ArrayList<>();
		//ll.add(12);
		//ll.add(56);
		//ll.toArray();
		//ll.set(0, 55);
		//System.out.println(ll.get(1));
		//System.out.println(ll);
		
		getTime(al);
		getTime(ll);
	}
	static void getTime(List<Integer> list) {
		long start=System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
		list.add(0,i);
		}long end=System.currentTimeMillis();
		System.out.println(list.getClass().getName() +" --> "+ (end - start));
	}
	

}
