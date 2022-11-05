package com.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Echo_com {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://echoecho.com/htmlforms10.htm");

		// locate element using tagname and attribute
		driver.findElement(By.xpath("//input[@name='radio1']"));
		// checking the default selection
		boolean milkradio1 = driver.findElement(By.xpath("//*[@value='Milk']")).isSelected();
		if (milkradio1 == false) {
			driver.findElement(By.xpath("//*[@value='Milk']")).click();
		}
		// combining 2 attributes to indentify unique element
		// driver.findElement(By.xpath("//*[@type='radio' and @value='Milk']")).click();
		boolean waterradio1 = driver.findElement(By.xpath("//*[@value='Water']")).isSelected();
		if (waterradio1 == false) {
			driver.findElement(By.xpath("//*[@value='Water']")).click();
		}

	}

}
