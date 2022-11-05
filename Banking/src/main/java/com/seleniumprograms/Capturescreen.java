package com.seleniumprograms;

//import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Library.SeleniumLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Capturescreen {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		SeleniumLibrary.capture_screen(driver,"C:\\Users\\arunl\\OneDrive\\Desktop\\screenshot","googlepage");
	     //FileUtils.copyFile(f, new File("C:\\Users\\arunl\\OneDrive\\Desktop\\screenshot\\screenshot02.png"));
	     driver.close();

	}

}
