package com.program.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
	public static void main(String[] args) {
		readFile("D:\\rs\\git hub\\Core Java\\Core-Java-Program\\CoreJavaExample\\JavaPrograms\\src\\com\\program\\files\\rahul.txt");
	}

	public static void readFile(String fileName) {
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			// Read the text file
			fileReader = new FileReader(fileName);
			// Wrap fileReader in BufferedReader
			bufferedReader = new BufferedReader(fileReader);
			String line =  null;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException ex1) {
			ex1.printStackTrace();
		} catch (IOException ex2) {
			ex2.printStackTrace();
		} catch (Exception ex3) {
			ex3.printStackTrace();
		} finally {
			try {
				fileReader.close();
				bufferedReader.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

	}
}
