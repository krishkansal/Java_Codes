package javaprojects;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Task2 {
	public static void main(String[] args) {
		
	int numLines = 0;   // no. of lines 
	int numWords = 0;   // no. of words
	int numChars = 0;   // total characters excluding spaces
	int numWhitespacecount = 0;  // blank spaces b/w words
	int numCharswithspace = 0;  // total characters including spaces
		
	Scanner myFile = null;
	try {
		Scanner file = new Scanner(new File("h:/test.txt"));
		myFile = file;
		
	} catch (FileNotFoundException e) {
		System.out.println("Your file does not exist.");
	}
	
	while(myFile.hasNextLine()) {
		String curLine = myFile.nextLine();
		int size = curLine.length();
		boolean foundDiv = true;
		boolean foundChar = false;
		
		for(int i= 0; i<size; i++) {
			if(curLine.charAt(i) == ' ') {
				foundDiv = true;
				foundChar = false;
			} else {
				foundChar = true;
				numChars++;
			}
			if(foundChar && foundDiv) {
				numWords++;
				numWhitespacecount = numWords-1;
				numCharswithspace = numChars + numWhitespacecount;
				foundDiv = false;
			}
		}
		numLines++;
	}
	myFile.close();
	System.out.println("1. Total Number of Characters in the File = " + numCharswithspace);  //including blank spaces
	System.out.println("2. Total Blank Spaces in the File = " + numWhitespacecount);
	System.out.println("3. Total Number of Words in the File = " + numWords);
	System.out.println("4. Total Number of Characters without Spaces in the File = " + numChars);
	System.out.println("5. Total Number of Lines in the File = " + numLines);
			
   }
	
}