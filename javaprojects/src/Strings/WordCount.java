package Strings;

import java.util.Scanner;

public class WordCount {

	public static int countWords(String str) {
		   
        int word=0;
        for(int i=0;i<str.length();i++) {
        	if(str.charAt(i)==' ') {
        		word++;
        	}
        	
        	
        }
        return word+1;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		countWords(str);
		System.out.print("word count : "+countWords(str));
	}

	}


