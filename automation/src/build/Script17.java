package build;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script17 {

	public static void main(String[] args)throws Exception {
		
		
FileInputStream fis =new FileInputStream("./testdata/FacebookCredentials.xlsx");
XSSFWorkbook workbook=new XSSFWorkbook(fis);
XSSFSheet sheet=workbook.getSheet("Sheet1");
XSSFRow row=sheet.getRow(1);
XSSFCell cel=row.getCell(1);
String val=cel.getStringCellValue();
System.out.println(val);
workbook.close();
fis.close();
System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement le=driver.findElement(By.id("email"));
le.sendKeys(val);
WebElement e = driver.findElement(By.xpath("//input[@type='password']"));
e.sendKeys(val);
Thread.sleep(3000);
WebElement h = driver.findElement(By.id("loginbutton"));
h.click();
Thread.sleep(3000);
driver.quit();


	}

}
