package theoryLec17_OOPWithFile_Collection_Generics;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileProblem {

	public static void main(String[] args) {
		String path = "D:\\C & Java Programming\\All Java Code Volt\\Java-Programming\\Java\\Java Student Theory-Spring2021\\src\\theoryLec16_OOPWithFile_Collection_Generics\\WordCounterTest.docx";
		/*
		// File Writing
		try {
			FileWriter myfile = new FileWriter(path, true);
			myfile.write("North South University");
			myfile.close();	
		} catch(IOException e) {
			System.out.println("File Writer is not Working");
		}
		*/
		// File Reading
		int wordCounter = 0; 
		try {
			Scanner input = new Scanner(new FileReader(path));    //File or FileReader
			while (input.hasNextLine()) {
				String[] wordHolder = input.nextLine().split(" ");
				for (int i = 0; i < wordHolder.length; i++) {
					if(wordHolder[i] != "?")
						wordCounter++;
				}
			}
		} catch(IOException e) {
			System.out.println("File Reader is not Working");
		}
		System.out.println("Total Word: " + wordCounter);
  
	}

}
