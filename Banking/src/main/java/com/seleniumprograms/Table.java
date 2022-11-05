package com.seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/tables");
		String rowsxpath = "//*[@id='table1']/tbody//tr"; // rows xpath
		// get all rows elements
		List<WebElement> rowelements = driver.findElements(By.xpath(rowsxpath));
		// Number of rows
		int numberofrows = rowelements.size();
		System.out.println("numberofrows in the table " + numberofrows);
		String TableXpath = "//*[@id='table1']/tbody/tr[";
		String SecondColumn = "]/td[2]";
		String expectedtext = "John";
		for (int i = 1; i <= numberofrows; i++) {
			String tablerowcolumnxpath = TableXpath + i + SecondColumn;
			System.out.println("table row column xpath " + tablerowcolumnxpath);
			String actualFirstName = driver.findElement(By.xpath(tablerowcolumnxpath)).getText();
			System.out.println("Actual First Name " + actualFirstName);
			if (expectedtext.equalsIgnoreCase(actualFirstName)) {
				driver.findElement(By.linkText("edit")).click();
			}

		}

	}

}
