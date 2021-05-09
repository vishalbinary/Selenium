//Program to read data from txt file, enter row number  you want to read(from input file).
package com.FileHandling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
public class ReadTextData {
	static int count;
	public static void readData(int rowNo) throws Exception {
		File file=new File("../March2021(Selenium)/input.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
	String st;
	   while((st=br.readLine()) !=null) {//loop runs till end of the data
		   count++;
		   if(count==rowNo) {
		   System.out.println(st);
		   break;}//loop break when input row is read.
	   }
		fr.close();	
	}
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row number to read data");
		int rowNo=sc.nextInt();
		sc.close();
		readData(rowNo);
	}
}