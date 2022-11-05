package com.seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Stringwithxpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		// xpath with text function
		driver.findElement(By.xpath("//a[text()='Tutorials']")).click();
		// xpath string availability check
		boolean status = driver.findElement(By.xpath("//*[text()='TUTORIALS']")).isDisplayed();
		System.out.println("Radio button text is available: " + status);
		// xpath click the link with text method
		driver.findElement(By.xpath("//*[text()='Free Resources']")).click();
		// xpath click the link with starts-with method

		driver.findElement(By.xpath("//*[starts-with(text(),'Online')]")).click();
		// xpath click the link with ends-with method
		driver.findElement(By.xpath("//*[ends-with(text(),'Articles')]")).click();
		// xpath click the link with contain method
		driver.findElement(By.xpath("//*[contains(text(),'Quiz')]")).click();

	}

}
