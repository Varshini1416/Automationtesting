package build;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script20 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com");
		List<WebElement>links=driver.findElements(By.xpath("//a"));
		int nooflinks=links.size();
		XSSFWorkbook book =new XSSFWorkbook();
XSSFSheet sheet=book.createSheet("flipkart links");
for(int i=0;i<nooflinks;i++)
{
	WebElement link=links.get(i);
	String url=links.getAttributes("href");
	XSSFRow row =sheet.createRow(i);
	XSSFCell cel=row.createCell(0);
	cel.setCellValue(url);
	
			
			
			
}
FileInputStream fos =new FileInputStream("./testdata/FacebookCredentials.xlsx");
book.write(fos);
book.close();
fos.close();
		}

}
