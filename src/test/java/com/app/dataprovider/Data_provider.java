package com.app.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {
	static WebDriver driver;
	@BeforeTest
	public void brwserlaunch() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Satheeshkumar J\\eclipse-workspace selenium0\\Usbaseclass\\driverrr\\chromedriver.exe");
		driver= new ChromeDriver();

	}
	@Test(dataProvider = "Test")
	public void test1(String username, String password) {
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(username);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	@AfterTest
	public void close() {
		//driver.close();
	}
	
	@DataProvider(name = "Test")
	public Object[][] method() {	
		return new Object[][] { {"username1","password1"},
			{"username2","password2" }};
	}

}
