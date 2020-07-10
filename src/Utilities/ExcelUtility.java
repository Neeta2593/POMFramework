package Utilities;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;


import java.io.FileInputStream;

import org.testng.annotations.DataProvider;

public class ExcelUtility {
  @DataProvider(name= "TestData")
  public Object[][] ExcelData() throws Exception {
	  String filePath ="F://work//POM//src//TestData//TestData.xls";
	  
	  FileInputStream Excelfile= new FileInputStream(filePath);
	  Workbook wb= Workbook.getWorkbook(Excelfile);
	  Sheet sh= wb.getSheet("TestData");
	  int Row =sh.getRows();
	  int col= sh.getColumns();
	  int count= 0;
	  //Create 2 dimentinal arrary to store the testdata
	  String TestData [][]= new String [Row-1][col];
	  
	  for (int i=1; i< Row;i++){
		  for (int j=0; j<col; j++){
			  Cell Exl= sh.getCell(j, i);
			  TestData[count][j]= Exl.getContents();
		  }
		  count++;
	  }
	  Excelfile.close();
	  return TestData;
    }
  }
