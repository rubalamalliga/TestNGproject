package Datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class correctusername {
	
	@Test
	@Parameters({"username","password"})
	public void loginwithcorrectusername (String uname, String pword) {
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
}
