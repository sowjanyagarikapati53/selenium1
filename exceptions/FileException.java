package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class FileException {

	public static void main(String[] args) {
		try {
			FileReader f=new FileReader("C:\\Users\\shekar\\Desktop\\sowjanya\\javaclass\\src\\javaprograms\\B.java");
			System.out.println("File read successfully");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			e.getMessage();
		}
		System.out.println("File saved successfully");
		
	}

}
