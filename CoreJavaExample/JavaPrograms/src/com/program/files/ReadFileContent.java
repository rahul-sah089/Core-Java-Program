package com.program.files;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReadFileContent {
	public static void main(String[] args) {
		readFile("D:\\rs\\git hub\\Core Java\\Core-Java-Program\\CoreJavaExample\\JavaPrograms\\src\\com\\program\\files\\rahul.txt");
	}

	public static void readFile(String fileName) {
		FileInputStream fis = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		try {
			fis = new FileInputStream(fileName);
			dis = new DataInputStream(fis);
			br = new BufferedReader(new InputStreamReader(dis));
			String line = "";
			while ((line = br.readLine()) != null) {
				StringTokenizer strT = new StringTokenizer(line, " ");
				while (strT.hasMoreTokens()) {
					System.out.println(strT.nextToken());
				}
			}

		} catch (FileNotFoundException ex1) {
			ex1.printStackTrace();
		} catch (IOException ex2) {
			ex2.printStackTrace();
		} catch (Exception ex3) {
			ex3.printStackTrace();
		} finally {
			try {
				fis.close();
				dis.close();
				br.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

	}
}
