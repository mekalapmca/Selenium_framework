package com.seleniumprograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task4windowshandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/demo");
		String parentwindow=driver.getWindowHandle();
		System.out.println("parent window name:" + parentwindow);
		driver.findElement(By.linkText("Sign Up")).click();
		boolean switch_status=false;
		String exp_windowTitle="Register - PHPTRAVELS";
		Set<String> allwindows=driver.getWindowHandles();
		for (String windoName : allwindows) {
			System.out.println(windoName);
			if(windoName.equals(parentwindow)==false) {
				driver.switchTo().window(windoName);
				String act_windowTitle=driver.getTitle();
				if(act_windowTitle.equals(exp_windowTitle)) {
					switch_status=true;
					break;
				}
			}
		}
		System.out.println(switch_status);
		if (switch_status == true) {
			driver.findElement(By.xpath("//input[@id ='inputFirstName']")).sendKeys("Automation");

		}
		
		//driver.close();
}

}


