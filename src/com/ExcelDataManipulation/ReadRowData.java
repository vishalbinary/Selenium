package com.ExcelDataManipulation;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ReadRowData {

	public static void readDataBasedUponRowNo(int rowNo) throws Exception {
		File file = new File("../March2021(Selenium)/Vishal.xls");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = Workbook.getWorkbook(fis);
		Sheet sheet = workbook.getSheet(0);
		int rowSize = sheet.getRows();// count data row size starts from 1
		int colSize = sheet.getColumns();// count column size starts from 1
		System.out.println("row size::" + rowSize + " col size: " + colSize);
		System.out.println("=========Row data is:==========");
		System.out.print("row (" + rowNo + ")::");
		for (int j = 0; j < colSize; j++) {// loop for the column
			Cell cell = sheet.getCell(j, rowNo);// get cell position from zero to ....
			System.out.print(cell.getContents()); // get cell content
			if (j == colSize - 1)
				break;
			System.out.print("||");

		}
		workbook.close();

	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row number");
		int rowNo = sc.nextInt();
		readDataBasedUponRowNo(rowNo);
		sc.close();

	}

}
