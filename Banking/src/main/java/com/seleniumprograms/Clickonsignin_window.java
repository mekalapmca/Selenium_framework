package com.seleniumprograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clickonsignin_window {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://practice.geeksforgeeks.org/courses");
	String parentwindow = driver.getWindowHandle();
	System.out.println("parent window name:" + parentwindow);
	//driver.findElement(By.xpath("//*[contains(text(),'https://media.geeksforgeeks.org/img-practice/banner/')]")).click();
	//WebElement temp=driver.findElement(By.xpath("//img[contains(@src,'https://media.geeksforgeeks.org/img-practice/banner/complete-interview-preparation-thumbnail.png?v=19276')]"));
	WebElement temp=driver.findElement(By.xpath("(//img[contains(@src,'https://media.geeksforgeeks.org/img-practice/banner/complete-interview-preparation-thumbnail.png?v=19276')])[1]"));
    temp.click();	
	String exp_WindowTitle ="Complete Interview Preparation - Self Paced";
	boolean switch_status = false;
	Set<String> allwindows = driver.getWindowHandles();
	for (String windowName : allwindows) {
		System.out.println(windowName);
		if (windowName.equals(parentwindow) == false) {
			driver.switchTo().window(windowName);
			String act_windowTitle = driver.getTitle();
			if (act_windowTitle.equals(exp_WindowTitle)) {
				switch_status = true;
				break;
			}
		}
	}
	System.out.println(switch_status);
	if (switch_status == true) {
		driver.findElement(By.xpath("(//*[@id='singInBtn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Username or email']")).sendKeys("meka@gmail.com");
		//*[@name='user']

	}
	
	// driver.close();

}
}

	


