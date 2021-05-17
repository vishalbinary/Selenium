//Program to copy excel(xls) data and past into another excel file
package com.ExcelDataManipulation;

import java.io.File;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class WriteExcelCopyPaste {

	public static void copyPasteExcel() throws Exception {
		File file1 = new File("File1.xls");
		File file2 = new File("File2.xls");
		Workbook workRead = Workbook.getWorkbook(file1);// file1 is read
		WritableWorkbook workWrite = Workbook.createWorkbook(file2);// file2 is created
		Sheet sheetReader = workRead.getSheet(0);// file1 sheet is got
		WritableSheet sheetWriter = workWrite.createSheet("Data", 0);// file2 sheet is created with name
		int rowSize = sheetReader.getRows();// row size start from 1
		int colSize = sheetReader.getColumns();// column size start form 1
		for (int i = 0; i < rowSize; i++) {// loop for rows

			for (int j = 0; j < colSize; j++) {// loop for columns
				Cell cell = sheetReader.getCell(j, i);// file1 Cell values are got

				Label label = new Label(j, i, cell.getContents());// file2 cell structure is created
				sheetWriter.addCell(label);// file2 cell is added and data is written

				System.out.print(cell.getContents());// file1 cell data is shown
				if (j == colSize - 1)
					break;
				System.out.print("||");

			}
			System.out.println();
		}
		System.out.println("Data is pasted in given file");
		workWrite.write();
		workRead.close();
		workWrite.close();

	}

	public static void main(String[] args) throws Exception {
		copyPasteExcel();

	}

}
