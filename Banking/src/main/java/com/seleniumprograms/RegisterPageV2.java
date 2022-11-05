package com.seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterPageV2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.findElement(By.id("email_create")).sendKeys("meka342765645@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		// checking the status of the checkbox

		boolean genderstatus = driver.findElement(By.id("id_gender2")).isSelected();
		if (genderstatus == false) {
			driver.findElement(By.id("id_gender2")).click();
		}
		driver.findElement(By.id("customer_firstname")).sendKeys("Mekala");
		driver.findElement(By.id("customer_lastname")).sendKeys("p");
		driver.findElement(By.id("passwd")).sendKeys("mekalameka");
		// Select a day from day dropdown
		Select dropdown = new Select(driver.findElement(By.id("days")));
		dropdown.selectByIndex(14);
		// Select a month from month dropdown
		Select monthdropdown = new Select(driver.findElement(By.id("months")));
		monthdropdown.selectByIndex(4);
		// Select a year from year dropdown
		WebElement yearelement = driver.findElement(By.id("years"));
		Select yeardropdown = new Select(yearelement);
		yeardropdown.selectByIndex(14);
		boolean checkbox1 = driver.findElement(By.id("newsletter")).isSelected();
		if (checkbox1 == false) {
			driver.findElement(By.id("newsletter")).click();
		}
		boolean checkbox2 = driver.findElement(By.id("optin")).isSelected();
		if (checkbox2 == false) {
			driver.findElement(By.id("optin")).click();
		}
		driver.findElement(By.id("company")).sendKeys("cts");
		driver.findElement(By.id("address1")).sendKeys("north street,siruseri,chennai");
		driver.findElement(By.id("address2")).sendKeys("north street,siruseri,chennai");
		driver.findElement(By.id("city")).sendKeys("chennai");
		// using Relative xpath
		Select statedropdown = new Select(driver.findElement(By.xpath("//*[@id='id_state']")));
		statedropdown.selectByIndex(5);
		driver.findElement(By.id("postcode")).sendKeys("60046");
		driver.findElement(By.id("other")).sendKeys("water tank");
		driver.findElement(By.id("phone_mobile")).sendKeys("9745678788");
		driver.findElement(By.id("alias")).clear();
		driver.findElement(By.id("alias")).sendKeys("karur");

		// * driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
		// driver.quit();
	}

}
