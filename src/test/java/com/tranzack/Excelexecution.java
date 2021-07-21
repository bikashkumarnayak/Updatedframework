package com.tranzack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.FrameworkConfig.Config;

public class Excelexecution {
	
	private Excelexecution() {}
	
	
	
	@Test(dataProvider = "getDataWithTable")
	public void exceldata(Map<String,String> data) {
		
		System.out.println(data.get("username"));
		
	}
	@DataProvider
	public Object[] getDataWithTable() throws IOException {
		File file=new File(Config.getExcel1());
		FileInputStream fs = new FileInputStream(file);
		Workbook wb =WorkbookFactory.create(fs);
		Sheet sheet = wb.getSheetAt(0);
		
		System.out.println(sheet.getLastRowNum());
		System.out.println(sheet.getRow(0).getLastCellNum());
		
		Object[] data = new Object[sheet.getLastRowNum()];
		DataFormatter formatter = new DataFormatter();
		Map<String,String> table;
		
		for(int i=1; i<=sheet.getLastRowNum(); i++) {
			table = new HashMap<>();
			for(int j=0; j<sheet.getRow(0).getLastCellNum();j++) {
				String key = sheet.getRow(0).getCell(j).getStringCellValue();
				System.out.println(key);
				String value = formatter.formatCellValue(sheet.getRow(i).getCell(j));
//				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
				table.put(key, value);
				data[i-1] = table;
			}
		}
		return data;
	}

}
