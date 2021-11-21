package app.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class browserlunch {
	
	@Test
	public void google() {
	long starttime = System.currentTimeMillis();
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Satheeshkumar J\\eclipse-workspace selenium0\\Testng\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
		long endtime = System.currentTimeMillis();
		long takentime = starttime-endtime;
		System.out.println("Total time taken"+ takentime);
	}	
	@Test
	public void bing() {
		long starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Satheeshkumar J\\eclipse-workspace selenium0\\Testng\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https//www.bing.com/");
		driver.quit();
		long endtime = System.currentTimeMillis();
		long takentime = starttime-endtime;
		System.out.println("Total time taken"+ takentime);
	}
	@Test
	public void whatsup() {
		long starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Satheeshkumar J\\eclipse-workspace selenium0\\Testng\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://web.whatsapp.com/");
			driver.quit();
			long endtime = System.currentTimeMillis();
			long takentime = starttime-endtime;
			System.out.println("Total time taken"+ takentime);
	}
	
	
}
