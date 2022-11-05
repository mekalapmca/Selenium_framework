package com.seleniumprograms;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Removedefaulttext_task2 {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/iframe");
		WebElement iframeElement = driver.findElement(By.xpath("//*[@id='mce_0_ifr']"));
		driver.switchTo().frame(iframeElement);
		driver.findElement(By.xpath("//*[contains(text(),'Your content goes here')]")).clear();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Elemental Selenium")).click();
		String parentwindow = driver.getWindowHandle();
		System.out.println("parent window name:" + parentwindow);
		String exp_WindowTitle = "Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro";
		boolean switch_status = false;
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
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys("automation");
		}

	}
}
