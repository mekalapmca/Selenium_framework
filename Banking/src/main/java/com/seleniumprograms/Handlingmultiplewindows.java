package com.seleniumprograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlingmultiplewindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		String parentwindow = driver.getWindowHandle();
		System.out.println("parent window name:" + parentwindow);
		driver.findElement(By.linkText("Elemental Selenium")).click();
		boolean switch_status = false;
		String exp_WindowTitle = "Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro";
		Set<String> allwindows = driver.getWindowHandles();
		for (String windowName : allwindows) {
			System.out.println(windowName);
			if (windowName.equals(parentwindow) == false) {
				driver.switchTo().window(windowName);
				String act_windowTitle = driver.getTitle();
				if (act_windowTitle.equals(exp_WindowTitle)) {
					switch_status = true;
		 			break;
				}
			}
		}
		System.out.println(switch_status);
		if (switch_status == true) {
			driver.findElement(By.id("email")).sendKeys("testing window");

		}
		Thread.sleep(4000);
		// driver.close();

	}
}
