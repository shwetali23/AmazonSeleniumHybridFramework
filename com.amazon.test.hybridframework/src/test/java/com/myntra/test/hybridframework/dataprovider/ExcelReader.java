package com.myntra.test.hybridframework.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	File file;
	FileInputStream inputStream;
	Workbook book;

	/**
	 * Constructor which initialize the file and workbook
	 * @throws InvalidFormatException
	 * @throws IOException
	 */
	public ExcelReader() throws InvalidFormatException, IOException {
		// TODO Auto-generated constructor stub
		file = new File("D:\\Selenium-workspace\\com.amazon.test.hybridframework\\testdata\\testdata.xlsx");
		inputStream = new FileInputStream(file);
		book = WorkbookFactory.create(inputStream);
	}

	/**
	 * This method would return cell data from excel sheet
	 * @param sheetName - name of the sheet
	 * @param row - row number from the excel sheet
	 * @param col - column number from the excel sheet
	 * @return the string value based on the row and col
	 */
	public String getDataFromExcel(String sheetName, int row, int col) {

		return book.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();

	}

}
