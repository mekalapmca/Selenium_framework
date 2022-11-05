package com.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

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
		WebElement m = driver
				.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		m.sendKeys("Selenium dependency");
		m.submit();
		// driver.quit();

	}

}
