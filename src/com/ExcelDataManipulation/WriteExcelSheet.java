//Program to write an xls file.
package com.ExcelDataManipulation;

import java.io.File;
import java.util.Scanner;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class WriteExcelSheet {
	private static Scanner sc, sc1;

	public static void writeData(int rowCount, int columnCount) throws Exception {
		File file = new File("FirstWorkbook.xls");// Connection Established
		WritableWorkbook workbook = Workbook.createWorkbook(file);// create workbook
		WritableSheet sheet = workbook.createSheet("data", 0);// Create sheet with name
		sc1 = new Scanner(System.in);
		for (int i = 0; i < rowCount; i++) {// loop for rows
			for (int j = 0; j < columnCount; j++) {// loop for columns
				System.out.println("Enter data for cell (" + i + j + ")");
				String string = sc1.nextLine();// take input from user

				Label label = new Label(j, i, string);// cell structure created
				sheet.addCell(label);// cell is created into the sheet

			}
		}
		workbook.write();// Workbook is written
		System.out.println("Excel file is created and data is set into Cells");
		workbook.close();// workbook closed
		sc1.close();// sc1 object close

	}

	public static void main(String[] args) throws Exception {
		sc = new Scanner(System.in);
		System.out.println("Enter the row size");
		int rowCount = sc.nextInt();
		System.out.println("Enter the column size");
		int columnCount = sc.nextInt();
		writeData(rowCount, columnCount);
		sc.close();

	}

}
