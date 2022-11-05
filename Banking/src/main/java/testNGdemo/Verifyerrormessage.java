package testNGdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verifyerrormessage {

	@Test
	public void Verifyerrormessage1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.xpath("//*[contains(text(),'Next')]")).click(); 
		Thread.sleep(2000);
		String actual_error=driver.findElement(By.xpath("//*[contains(text(),'Enter an email or phone number')]")).getText();
		String excepted_error="Enter an email or phone number";
		Assert.assertEquals(actual_error, excepted_error);
		Assert.assertTrue(actual_error.contains("Enter an email"));
		System.out.println("Test completed");
		
	}
}
