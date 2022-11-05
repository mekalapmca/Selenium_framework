package com.seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo2 {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");	
		WebElement iframeElement= driver.findElement(By.xpath("//*[@id='iframeResult']"));
		driver.switchTo().frame(iframeElement);
		driver.findElement(By.xpath("//*[@onclick='myFunction()']")).click();
		driver.switchTo().defaultContent();

	}

}
