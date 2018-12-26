package com.actitimetemp.genericlib;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib {
	String excelpath="./testdata/testdata.xlsx";
	public String getexceldata(String sheetname,int colnum,int rownum) throws Throwable

{
	
FileInputStream fis=new FileInputStream(excelpath);	
Workbook wb=WorkbookFactory.create(fis);
Sheet sh=wb.getSheet(sheetname);
Row rw=sh.getRow(rownum);
String data=rw.getCell(colnum).getStringCellValue();
wb.close();
return data;

}
public void setexceldata(String sheetname,int colnum,int rownum,String data) throws Throwable
{
	FileInputStream fis=new FileInputStream(excelpath);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheetname);
	Row rw=sh.getRow(rownum);
	Cell cl=rw.createCell(colnum);
	cl.setCellValue(data);
	
	FileOutputStream fos=new FileOutputStream(excelpath);
	wb.write(fos);
	wb.close();
}
public Properties getpropertyobject() throws Throwable
{
FileInputStream fis=new FileInputStream("D:\\Automation\\CRMacttimeFramework\\testdata\\commondata.properties");
Properties pobj=new Properties();
pobj.load(fis);
return pobj;
}
}
