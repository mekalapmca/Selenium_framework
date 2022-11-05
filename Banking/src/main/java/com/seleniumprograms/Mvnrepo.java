package com.seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mvnrepo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver=new ChromeDriver();  //create object for the chromedriver class
		driver.get("https://mvnrepository.com/"); //Enter the url in the opened browser
		driver.quit();
		
		

	}

}
