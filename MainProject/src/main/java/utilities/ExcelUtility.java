package utilities;

import java.io.FileInputStream;

import java.io.IOException;



import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;



import constants.Constants;

public class ExcelUtility {

	static FileInputStream f;       //inbuilt methods

	static XSSFWorkbook w;

	static XSSFSheet sh;



	public static String readStringData(int row, int col, String sheet) throws IOException

	     {

	f = new FileInputStream(Constants.path);//path of excel in constant class

	w = new XSSFWorkbook(f);        // read the workbook

	sh = w.getSheet(sheet);      // read the sheet of workbook

	XSSFRow r = sh.getRow(row);     // read the row

	XSSFCell c = r.getCell(col);     // read the cell

	return c.getStringCellValue();   //read the  string value

	        }

	public static String readintegerdata(int row, int col, String sheet) throws IOException

	       {

	f = new FileInputStream(Constants.path);

	w = new XSSFWorkbook(f);

	sh = w.getSheet(sheet);         //getsheet is a  method

	XSSFRow r = sh.getRow(row);

	XSSFCell c = r.getCell(col);

	int value=(int) c.getNumericCellValue();  // datatype of getnumberic cell is double.if we gave as this we got an error so we convert double to int

	return String.valueOf(value);              // convert int to string using valuesof method because we gave  string data type

	    }



	}

