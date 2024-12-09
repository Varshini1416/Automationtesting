package build;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Script18 {

	public static void main(String[] args) throws IOException{
		FileInputStream fis =new FileInputStream("./testdata/FacebookCredentials.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet("Sheet1");
		int lr=sheet.getLastRowNum();
		for(int i=0;i<=lr;i++)
		{
			XSSFRow row=sheet.getRow(i);
			XSSFCell cel1=row.getCell(0);
			String clval=cel1.getStringCellValue();
		    XSSFCell cel2=row.getCell(1);
			String clva2=cel2.getStringCellValue();
			System.out.println(clval+" "+" "+clva2);
		
		}
		book.close();
		fis.close();
		
	}

}
