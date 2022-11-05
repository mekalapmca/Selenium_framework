package com.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_v2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String name = driver.getTitle();
		System.out.println("Page title is : " + name);
		System.out.println("Page title is : " + driver.getPageSource());
		// System.out.println("Page title is : " + driver.getTitle());
		System.out.println("Current URL is : " + driver.getCurrentUrl());
		WebElement a = driver.findElement(By.xpath("//input[@name='q']"));
		a.sendKeys("automation");
		a.sendKeys(Keys.ENTER);
		driver.quit();

		// driver.findElement(By.xpath("//*[@name='q']")).sendKeys("automation");
		// driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.ENTER);

	}

}
