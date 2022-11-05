package testNGdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testng_demo2 {
	WebDriver driver;
	@Test(priority=1)
	public void startApp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        String currenturl=driver.getCurrentUrl();
        Assert.assertTrue(currenturl.contains("authentication"));
	}
	@Test(priority=2 ,dependsOnMethods = "startApp")
	public void login() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("meka3427656@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("mekalameka");
		driver.findElement(By.xpath("//*[@id='SubmitLogin']")).click();
		boolean status=driver.findElement(By.linkText("Women")).isDisplayed();
		Assert.assertTrue(status);
	}
		@Test(priority=3,dependsOnMethods = {"startApp" ,"login"})
		public void logout() {
			driver.findElement(By.linkText("Sign out")).click();
			Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Already registered')]")).isDisplayed());
		}
		@Test(priority=4,	 dependsOnMethods = {"startApp" , "login" ,"logout"})
		private void close() {
			driver.quit();
			

		}
}
