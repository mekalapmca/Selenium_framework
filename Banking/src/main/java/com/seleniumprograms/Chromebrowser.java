package com.seleniumprograms;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chromebrowser {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
    ChromeDriver driver=new ChromeDriver();
    
    driver.quit();

	}

}
