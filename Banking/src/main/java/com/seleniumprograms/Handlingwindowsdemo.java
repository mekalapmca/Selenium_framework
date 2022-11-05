package com.seleniumprograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlingwindowsdemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		String parentwindow = driver.getWindowHandle();
		System.out.println("parent window name:" + parentwindow);
		driver.findElement(By.linkText("Elemental Selenium")).click();
		Set<String> allwindows = driver.getWindowHandles();
		for (String windowName : allwindows) {
			System.out.println(windowName);
			if (windowName.equals(parentwindow) == false) {
				driver.switchTo().window(windowName);
				driver.findElement(By.id("email")).sendKeys("testing window");
			}

		}
		Thread.sleep(5000);
		// driver.close();

	}

}
