//Program read data from one file and write the same data into another file
package com.FileHandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadOneWriteAnotherFile {

	public static void readAndWrite() throws Exception {

		File file1 = new File("../March2021(Selenium)/file1.txt");
		File file2=new File("../March2021(Selenium)/file2.txt");
		FileReader fr = new FileReader(file1);
		FileWriter fw = new FileWriter(file2);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		String st;
		int count=0;
		while ((st = br.readLine()) != null) {//data if read from file1 and check weather line is null
			count++;
			if(count>1)bw.newLine();
			System.out.println(st);
			bw.write(st);//Data is written from file1 to file2
			
			
		}
		br.close();
		bw.close();
	}

	
	public static void main(String[] args) throws Exception {

		readAndWrite();
	}

}
