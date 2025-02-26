package firstPkg;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadFileExcel 
{
	//new excel - XSSF
	//old excel - HSSF

	public static void readexcel() throws Exception
	{
		File f = new File("C:\\TestData\\Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheet("DataSheet");
		int nr = sheet1.getPhysicalNumberOfRows();
		System.out.println(nr);
		
		for(int i=0;i<nr;i++)
		{
			XSSFRow row = sheet1.getRow(i);  //i=0
			
			int nc = row.getPhysicalNumberOfCells(); //nc=4
			for(int j=0;j<nc;j++)
			{
				XSSFCell col = row.getCell(j);
				
				if(col.getCellType()==CellType.STRING)
				{
					System.out.print(col.getStringCellValue() + "     ");
					
				}
				
				else if(col.getCellType()==CellType.NUMERIC)
					
				{
					System.out.print(col.getNumericCellValue() + "     ");
				}
				
				else
				{
					System.out.print(col.getStringCellValue() + "     ");
				}
				
			}
			
			System.out.println();
			
		}
		
		/*
		XSSFRow row1 = sheet1.getRow(0);
		XSSFCell col1 = row1.getCell(0);
		System.out.println(col1.getStringCellValue());
		
		XSSFCell col2 = row1.getCell(1);
		System.out.println(col2.getStringCellValue());
		
		
		XSSFRow row2 = sheet1.getRow(1);
		XSSFCell col21 = row2.getCell(0);
		System.out.println(col21.getNumericCellValue());
		
		*/
		
	}
	
	public static void main(String[] args) throws Exception {
		readexcel();
		
	}
	
	
}
