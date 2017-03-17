package com.program.files;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {
	public static void main(String[] args) {
		writeFile("D:\\rs\\git hub\\Core Java\\Core-Java-Program\\CoreJavaExample\\JavaPrograms\\src\\com\\program\\files\\textFile.txt");
	}

	public static void writeFile(String file) {
		FileWriter fileWriter = null;
		BufferedWriter bfw = null;
		try {
			// Assume default encoding
			fileWriter = new FileWriter(file);
			// Always wrap fileWriter in BufferedWriter
			bfw = new BufferedWriter(fileWriter);

			bfw.write("Hello there,Nice to see you,");
			bfw.write(" how was your day dear,");
			bfw.write(" is everything fine!!!");

		} catch (FileNotFoundException ex1) {
			ex1.printStackTrace();
		} catch (IOException ex2) {
			ex2.printStackTrace();
		} catch (Exception ex3) {
			ex3.printStackTrace();
		} finally {
			try {
				bfw.close();
				fileWriter.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
