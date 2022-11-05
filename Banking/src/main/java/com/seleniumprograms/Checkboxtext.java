package com.seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxtext {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://echoecho.com/htmlforms09.htm");
		List<WebElement> checkboxxpath = driver
				.findElements(By.xpath("//*[@cellpadding='3'][3]//tbody/tr/td/table//tbody/tr/td/input"));
		int checkboxcount = checkboxxpath.size();
		System.out.println("Number of Checkboxes: " + checkboxcount);
		String checkboxpath = "//*[@cellpadding='3'][3]//tbody/tr/td/table//tbody/tr/td/input[";
		String checkboxend = "]";
		for (int i = 1; i <= checkboxcount; i++) {
			String checkboxselection = checkboxpath + i + checkboxend;
			boolean status = driver.findElement(By.xpath(checkboxselection)).isSelected();
			String name = driver.findElement(By.xpath(checkboxselection)).getAttribute("value");
			if (status == false) {
				System.out.println("Unchecked Checkbox Names: " + name);
			} else {
				System.out.println("Default Checked Checkbox Names: " + name);
			}

		}

	}

}
