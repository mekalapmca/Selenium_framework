package com.seleniumprograms;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/dropdown");
		//create an object for the select class, to select an item from dropdown
		//WebElement list=driver.findElement(By.id("dropdown"));
		//Select dropdown=new Select();
		//dropdown.selectByVisibleText("Option 2");
		//dropdown.selectByVisibleText(")
		//driver.quit();
		
		

	}

}
