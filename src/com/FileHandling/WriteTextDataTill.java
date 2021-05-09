package com.FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteTextDataTill {
	static String st;
	static Scanner sc, sc1;

	public static void writeData(int row) throws Exception {
		sc1 = new Scanner(System.in);
		File file = new File("../March2021(Selenium)/output.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);

		int i;
		for (i = 1; i <= row; i++) {// loop runs till no. of row entred
			System.out.println("Enter the input data");
			st = sc1.nextLine();// data is input from user
			bw.write(st);// data is written in the file
			if (i == row) { // next line will not consider when true
				bw.close();
				sc1.close();
				break;
			}
			bw.newLine();

		}

	}

	public static void main(String... text) throws Exception {
		sc = new Scanner(System.in);
		System.out.println("Enter the row number");

		int num = sc.nextInt();
		writeData(num);
		sc.close();

	}

}
