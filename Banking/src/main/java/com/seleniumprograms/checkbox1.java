package com.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Library.SeleniumLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkbox1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://echoecho.com/htmlforms09.htm");

		// locate element using tagname and attribute
		//driver.findElement(By.xpath("//input[@name='checkbox1']"));
		// checking the default selection
		boolean milkcheckbox1 = driver.findElement(By.xpath("//*[@value='Milk']")).isSelected();
		if (milkcheckbox1 == false) {
			WebElement checkbox= driver.findElement(By.xpath("//*[@value='Milk']"));
			SeleniumLibrary.SelectTo_Checkboxbutton(checkbox);
		}
		// combining 2 attributes to indentify unique element
		// driver.findElement(By.xpath("//*[@type='radio' and @value='Milk']")).click();
		boolean watercheckbox1 = driver.findElement(By.xpath("//*[@value='Cheese']")).isSelected();
		if (watercheckbox1 == false) {
			WebElement checkbox_element= driver.findElement(By.xpath("//*[@value='Cheese']"));
			SeleniumLibrary.SelectTo_Checkboxbutton(checkbox_element);
		}

	}

}
