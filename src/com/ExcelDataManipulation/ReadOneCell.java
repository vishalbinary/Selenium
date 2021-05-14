//Program is to get a particular cell data of excel sheet
package com.ExcelDataManipulation;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ReadOneCell {

	public static void readDataBasedUponRowNoAndColumnNo(int rowNo, int colNo) throws Exception {
		File file = new File("../March2021(Selenium)/Vishal.xls");// read excel file
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = Workbook.getWorkbook(file);
		Sheet sheet = workbook.getSheet(0);// contains sheet name of excel

		System.out.println("=============Cell data is:=============");
		Cell cell = sheet.getCell(colNo, rowNo);// get cell position
		System.out.println("cell(" + rowNo + "," + colNo + "):: " + cell.getContents());// get content of the cell
		workbook.close();
		fis.close();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Enter row number");
		Scanner sc = new Scanner(System.in);
		int rowNo = sc.nextInt();
		System.out.println("Enter column number");
		int colNo = sc.nextInt();
		readDataBasedUponRowNoAndColumnNo(rowNo, colNo);
		sc.close();

	}

}
