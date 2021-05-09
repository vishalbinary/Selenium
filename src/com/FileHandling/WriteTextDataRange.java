//Programe write data in text file from initial row to end row.
package com.FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteTextDataRange {
	static Scanner sc, sc1;
	static String st;

	public static void writeDataInARange(int initRow, int endRow) throws Exception {
		sc1 = new Scanner(System.in);
		File file = new File("../March2021(Selenium)/Range.txt");// text file created
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		for (int i = 1; i <= endRow; i++) {//loop runs till end row
			if (i >= initRow) {//condition is checked for starting line
				System.out.println("Enter the data");
				st = sc1.nextLine();
				bw.write(st);//data is written in file
				if (i == endRow) {//check i=last line, so at last nextline will not invoked
					sc1.close();
					bw.close();
					break;
				}

			}
			bw.newLine();
		}

	}

	public static void main(String[] args) throws Exception {
		sc = new Scanner(System.in);
		int endRow, initRow;
		//Here do while loop check starting range(!<1) should be less than end range
		do {
			System.out.println("Enter the starting range");
			initRow = sc.nextInt();
			System.out.println("Enter the end range ");
			endRow = sc.nextInt();
			if (endRow <= initRow)
				System.out.println("end range should be greater than the starting range");
		} while (endRow < initRow || endRow == initRow || initRow < 1);
		writeDataInARange(initRow, endRow);

	}

}
