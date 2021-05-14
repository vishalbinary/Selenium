//Programe read rows from initial row to end row 
package com.ExcelDataManipulation;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ReadExcelDataRange {
	public static void readDataBasedUponRange(int initRow, int endRow) throws Exception {

		File file = new File("../March2021(Selenium)/Vishal.xls");// reads excel file
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = Workbook.getWorkbook(fis);
		Sheet sheet = workbook.getSheet(0);// find the sheet by name
		int colSize = sheet.getColumns();// count column size starts from zero

		for (int i = initRow; i <= endRow; i++) {// loop runs for rows
			System.out.print("Row " + i + ":: ");
			for (int j = 0; j < colSize; j++) {// loop runs for columns
				Cell cell = sheet.getCell(j, i);// get cell position
				System.out.print(cell.getContents());// get cell data
				if (j == colSize - 1)
					break;
				System.out.print("||");

			}
			System.out.println();

		}
		workbook.close();

	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the initial row");
		int initRow = sc.nextInt();
		System.out.println("Enter the end row");
		int endRow = sc.nextInt();
		readDataBasedUponRange(initRow, endRow);
		sc.close();
	}

}
