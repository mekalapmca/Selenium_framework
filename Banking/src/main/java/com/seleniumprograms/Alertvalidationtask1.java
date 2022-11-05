package com.seleniumprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertvalidationtask1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		String compare_text=driver.switchTo().alert().getText();
		System.out.println(compare_text);
		
		if(compare_text.equals("Please enter a valid user name")) {
			System.out.println("Values are equals");
			driver.switchTo().alert().accept();
		 
		 }
		

	}

}
