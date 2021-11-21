package com.Testngworking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class parallel {

	@Test
	public void openbrower() {
		System.setProperty("WebDriver.edge.driver","C:\\Users\\Satheeshkumar J\\eclipse-workspace selenium0\\Testng\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.co.in/");
		//driver.quit();
	}
	
	@Test
	public void openbrower2() {
		System.setProperty("WebDriver.edge.driver","C:\\Users\\Satheeshkumar J\\eclipse-workspace selenium0\\Testng\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.bing.com/");
		//driver.quit();
}
}