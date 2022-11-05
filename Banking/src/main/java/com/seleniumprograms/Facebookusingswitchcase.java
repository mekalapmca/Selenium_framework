package com.seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebookusingswitchcase {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'New Account')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mekala");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("P");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9846738268");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("mekal123");
		Select dropdown5 = new Select(driver.findElement(By.xpath("//*[@id='day']")));
		dropdown5.selectByIndex(5);
		Select dropdown6 = new Select(driver.findElement(By.xpath("//*[@title='Month']")));
		dropdown6.selectByIndex(6);
		Select dropdown7 = new Select(driver.findElement(By.xpath("//*[@name='birthday_year']")));
		dropdown7.selectByIndex(14);
		String gender = "Female";
		String act_gender=gender.toLowerCase();
		switch (act_gender) {
		case "female":
			driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();
			break;
		case "male":
			driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
			break;
		case "custom":
			driver.findElement(By.xpath("//input[@type='radio' and @value='-1']")).click();
			break;
		default:
			System.out.println("Input is not valid: "+gender);
			break;
		}
		driver.quit();
	}
}
