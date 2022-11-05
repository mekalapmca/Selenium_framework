package com.seleniumprograms;

import java.time.Duration;
import java.time.MonthDay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Library.SeleniumLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

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
		//Select dropdown5 = new Select(driver.findElement(By.xpath("//*[@id='day']")));
		//dropdown5.selectByIndex(5);
		//SeleniumLibrary.SelectItemFromDropdown1(dropdown1=, 5);
		Select dropdown6 = new Select(driver.findElement(By.xpath("//*[@title='Month']")));
		dropdown6.selectByIndex(6);
		Select dropdown7 = new Select(driver.findElement(By.xpath("//*[@name='birthday_year']")));
		dropdown7.selectByIndex(14);
		// boolean
		// gender=driver.findElement(By.xpath("//input[@value='1']")).isSelected();
		// String gender1=driver.findElement(By.xpath("//*[text()='Male']")).getText();
		String gender = "Female";
		
		//System.out.println(gender);
		if (gender.equalsIgnoreCase("Male")) {
			driver.findElement(By.xpath("//input[@value='2']")).click();

		} else if (gender.equalsIgnoreCase("Female")) {
			driver.findElement(By.xpath("//input[@value='1']")).click();
		} else if (gender.equalsIgnoreCase("Custom")){
			driver.findElement(By.xpath("//input[@value='-1']")).click();
		}else {
			System.out.println("Gender input value is invalid: "+gender);
		}
		

		// driver.quit();
	}
}
