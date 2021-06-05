package Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fileOutputStream;
		
		try {
			fileOutputStream = new FileOutputStream("temp/abc.txt");
			String msg = "Welcome to java!";   
			
			byte byteArray[] = msg.getBytes(); //converting string into byte array 
			
			fileOutputStream.write(byteArray);  
			
			System.out.println("Message written to file successfuly!");  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IO Exception");
		}
		
		 

	}

}