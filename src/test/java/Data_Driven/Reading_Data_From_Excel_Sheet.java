package Data_Driven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reading_Data_From_Excel_Sheet {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis = new FileInputStream(".//src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String url= wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String User= wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String password= wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
		System.out.println(url);
		System.out.println(User);
		System.out.println(password);
		
		// driver related statement
		WebDriverManager.chromedriver().setup();
		//for opening the Chrome browser
		WebDriver driver= new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Writing data from site to excel sheet
		driver.get(url);
		String title = driver.getTitle();
		
		wb.getSheet("Sheet1").createRow(6).createCell(0).setCellValue(title);
		FileOutputStream fos = new FileOutputStream(".//src/test/resources/TestData.xlsx");
		wb.write(fos);
	}
}
