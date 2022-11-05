package com.seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobutton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://echoecho.com/htmlforms10.htm");
		List<WebElement> Radiobuttonxpath = driver
				.findElements(By.xpath("//*[@cellpadding='3'][3]/tbody/tr/td/table/tbody/tr/td/input"));
		int radiobuttoncount = Radiobuttonxpath.size();
		System.out.println("Number of Radiobutton: " + radiobuttoncount);
		String Radioxpath = "//*[@cellpadding='3'][3]//tbody/tr/td/table//tbody/tr/td/input[";
		String radiobuttonend = "]";
		for (int i = 1; i <= radiobuttoncount; i++) {
			String radiobuttonselection = Radioxpath + i + radiobuttonend;
			boolean status = driver.findElement(By.xpath(radiobuttonselection)).isSelected();
			String name = driver.findElement(By.xpath(radiobuttonselection)).getAttribute("value");
			if (status == false) {
				System.out.println("Unchecked Radiobutton Names: " + name);
			} else {
				System.out.println("Default Checked Radiobutton Names: " + name);
			}

		}

	}

}
