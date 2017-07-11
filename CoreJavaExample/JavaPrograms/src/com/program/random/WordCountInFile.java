package com.program.random;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordCountInFile {
	public static void main(String[] args) {
		System.out.println("Main method started");
		countFileCount("D:\\rs\\repo\\Core-Java-Program\\CoreJavaExample\\JavaPrograms\\src\\example.txt");
		System.out.println("Main method ended");
	}

	public static void countFileCount(String fileName) {
		FileInputStream fis = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		String line = null;
		try {
			fis = new FileInputStream(fileName);
			dis = new DataInputStream(fis);
			br = new BufferedReader(new InputStreamReader(dis));
			while ((line = br.readLine()) != null) {
				// System.out.println(line);
				StringTokenizer st = new StringTokenizer(line, " ");
				while (st.hasMoreTokens()) {
					String temp = st.nextToken().toLowerCase();
					if (wordMap.containsKey(temp)) {
						wordMap.put(temp, (wordMap.get(temp)) + 1);
					} else {
						wordMap.put(temp, 1);
					}
				}
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		System.out.println(wordMap);
	}
}
