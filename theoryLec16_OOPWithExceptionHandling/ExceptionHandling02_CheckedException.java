package theoryLec16_OOPWithExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandling02_CheckedException {

	public static void main(String[] args) {
		String fileAddress = "Test  Writing.txt";
		File file = new File(fileAddress);
		try {
			file.createNewFile();	
			System.out.println("File read is working");
		} catch(IOException e) {
			System.out.println("Eception Handled from IOException");
		}


	}

}
