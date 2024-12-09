package build;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Script19 {

	public static void main(String[] args) {
XSSFWorkbook book =new XSSFWorkbook();
XSSFSheet sheet =book.createSheet("Automation Framework");
XSSFRow row=sheet.createRow(0);
XSSFCell cel=row.createCell(0);
cel.setCellValue("Autamatonclass");
FileInputStream fos =new FileInputStream("./testdata/FacebookCredentials.xlsx");
book.write(fos);
book.close();
fos.close();
}

}
