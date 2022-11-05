package com.seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.Library.SeleniumLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousehover_demo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/");
		WebElement desktop1 = driver.findElement(By.linkText("Desktops"));
		SeleniumLibrary.MousehoverTo_element(desktop1, driver);
		//Actions action = new Actions(driver);
		//action.moveToElement(desktop1).build().perform();
		WebElement pc2 = driver.findElement(By.linkText("PC (0)"));
		SeleniumLibrary.MousehoverTo_element(pc2, driver);
		//action.moveToElement(pc2).build().perform();
		WebElement mac3 = driver.findElement(By.linkText("Mac (1)"));
		SeleniumLibrary.MousehoverTo_element(mac3, driver);
		//action.moveToElement(mac3).build().perform();
		mac3.click();
		WebElement component = driver.findElement(By.linkText("Components"));
		//action.moveToElement(component).build().perform();
		WebElement monitor = driver.findElement(By.linkText("Monitors (2)"));
		//action.moveToElement(monitor).build().perform();
		monitor.click();
	}
}
