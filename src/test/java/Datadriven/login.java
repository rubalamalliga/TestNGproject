package Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class login {
	List<String> userNameList=new ArrayList<String>();
	List<String> passwordList=new ArrayList<String>();
	
	String [][] data= null;
		
	@DataProvider(name= "logindata")
	public String[][] loginwithdataprovider() throws IOException {
		
		data=excelRead();
		
		return data;
		}
	
	public String[][] excelRead() throws IOException {

					
		FileInputStream fis = new FileInputStream("C:\\Users\\Satheeshkumar J\\eclipse-workspace selenium0\\Testng\\ruby\\Datadriven.xlsx");
		Workbook wb = new XSSFWorkbook(fis);
		org.apache.poi.ss.usermodel.Sheet sheet= wb.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.iterator();
		while(rowIterator.hasNext()){
			Row rowValue = rowIterator.next();
			
			Iterator<Cell> columnIterator=rowValue.iterator();
			int i=2;
			while(columnIterator.hasNext()) {
				if(i%2==0) {
					userNameList.add(columnIterator.next().getStringCellValue());
				
				}else {
					passwordList.add(columnIterator.next().getStringCellValue());
			}
		i++;
		}
			
		
		}
		return data;
		
		
	}

	
	private Row getRow(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test(dataProvider = "logindata")

	public void loginwithbothcorrect (String uname, String pword) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Satheeshkumar J\\eclipse-workspace selenium0\\Testng\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username = driver.findElement(By.id("txtUsername"));
			username.sendKeys(uname);
			
			WebElement password=driver.findElement(By.id("txtPassword"));
			password.sendKeys(pword);
			
			WebElement loginbutton = driver.findElement(By.id("btnLogin"));
			loginbutton.click();
			driver.quit();
			
			}
	
	public void executetest() {
		for(int i=0; i<userNameList.size();i++) {
			loginwithbothcorrect(userNameList.get(i),passwordList.get(i));
		}
	}

}


