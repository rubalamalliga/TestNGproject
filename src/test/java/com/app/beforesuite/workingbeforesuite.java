package com.app.beforesuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class workingbeforesuite {
	WebDriver driver;
long starttime;
long endtime;
	
@BeforeSuite

public void lunchbrowser() {
	System.setProperty("WebDriver.chrome.driver",
			"C:\\Users\\Satheeshkumar J\\eclipse-workspace selenium0\\Testng\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	starttime = System.currentTimeMillis();
}

	
	@Test
	public void google() {
			driver.get("http://www.google.co.in");
	
		}	
	@Test
	public void bing() {
		
		driver.get("http://www.bing.com");
	
			}
	@Test
	public void whatsup() {
			driver.get("http://www.yahoo.com");
		
	}
	
	@AfterSuite

	public void closebrowser() {
		//driver.quit();
	endtime = System.currentTimeMillis();
		long takentime = endtime-starttime;
		System.out.println("total timetaken" + takentime );
}
	}
