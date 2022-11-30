package javaprojects;


import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInput 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream sourceStream = null;
		FileOutputStream targetStream = null;
		
		try {
			sourceStream = new FileInputStream("e:/source.txt");
			targetStream = new FileOutputStream("e:/source.txt");
			
			// Reading source file  and writing
			// content to target file byte by byte
			
			int temp;
			while (( temp = sourceStream.read())!= -1)
			{
				System.out.println(temp);
				targetStream.write((byte)temp);
			}
		}
		finally {
			if(sourceStream != null)
				sourceStream.close();
			if(targetStream != null)
				targetStream.close();
			
		}

	}

}