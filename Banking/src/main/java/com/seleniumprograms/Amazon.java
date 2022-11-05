 package com.seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=amazon+prime+login&rlz=1C1CHBD_en-GBIN1023IN1023&oq=am&aqs=chrome.4.69i59l2j69i57j0i67i131i433j0i67j69i60l3.4035j0j7&sourceid=chrome&ie=UTF-8");
        driver.close();
	}

}
