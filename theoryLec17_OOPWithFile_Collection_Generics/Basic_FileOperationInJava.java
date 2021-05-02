package theoryLec17_OOPWithFile_Collection_Generics;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Basic_FileOperationInJava {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String filePath = filePath = "D:\\C & Java Programming\\All Java Code Volt\\Java-Programming\\Java\\Java Student Theory-Spring2021\\src\\theoryLec16_OOPWithFile_Collection_Generics\\File.txt";
		
		// File Writer
		boolean isFileWrite = true;
		try {
			FileWriter f1 = new FileWriter(filePath, isFileWrite);
			for (int i = 0; i < 10; i++) {
				f1.write("Hello Hello" + "\n");
			}

			f1.close();
			System.out.println("File is created.");
		} catch (IOException e) {
			System.out.println("File is Not Working.");
		}
		
		// File Reader
		try {
			Scanner fileScan = new Scanner(new FileReader(filePath));
			while (fileScan.hasNextLine()) {
				String  readData = fileScan.nextLine();
				System.out.println(readData);
			}
			fileScan.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Reader is not working");
		}
		
		
		/*
                // File extra method explore
		try {
			File f1 = new File(filePath);
			if(f1.exists()) {
				System.out.println(f1.getName());
				System.out.println(f1.length() / 1024 + "KB");
				System.out.println("File is created before.");
			}
			else 
				f1.createNewFile();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
	}
}
