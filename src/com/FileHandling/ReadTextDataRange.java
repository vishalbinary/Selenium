//Programe read the text data according to the given range.
package com.FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadTextDataRange {
	static Scanner sc;
	static int count;

	public static void readDataOfRange(int initRow, int endRow) throws Exception {
		File file = new File("../March2021(Selenium)/input.txt");
		FileReader fw = new FileReader(file);
		BufferedReader br = new BufferedReader(fw);
		String st;
		while ((st = br.readLine()) != null) {
			count++;
			if (count <= endRow && count >= initRow)
				System.out.println(st);
			if(count==endRow)break;//loop break after end row is read

		}
		br.close();

	}

	public static void main(String[] args) throws Exception {
		sc = new Scanner(System.in);
		System.out.println("Enter the starting row");
		int initRow = sc.nextInt();
		System.out.println("Enter the end row");
		int endRow = sc.nextInt();
		readDataOfRange(initRow, endRow);

	}
}