package com.qa.JPetStore.config;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConfigurationExcel {
	private static String[][] data;

	public static String[][] excelData() throws Exception {
		File file = new File(
				"../JPetStore_Automation_Demo/src/main/java/com/qa/JPetStore/config/JPetStoreSignUpData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		XSSFWorkbook workbook = new XSSFWorkbook(bis);
		XSSFSheet sheet = workbook.getSheet("SignUpPage");
		int rowSize = sheet.getPhysicalNumberOfRows();// start from 1
		int columnSize = sheet.getRow(0).getLastCellNum();// start from 1
		data = new String[rowSize - 1][columnSize];
		System.out.println(rowSize + " " + columnSize);
		for (int i = 1; i < rowSize; i++) {// loop for rows
			// XSSFRow row=sheet.getRow(i);
			for (int j = 0; j < columnSize; j++) {// loop for columns

				data[i - 1][j] = (sheet.getRow(i).getCell(j).toString());// data is stored in string of array
				System.out.print(sheet.getRow(i).getCell(j).toString());
				if (j == (columnSize - 1))
					break;
				System.out.print("||");
			}
			System.out.println();
		}
		workbook.close();
		return data;
	}
}