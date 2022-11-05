package com.seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoRegisterDemov2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		// driver.findElement(By.xpath("//input[@placeholder='First
		// Name']")).sendKeys("Automation");
		// driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Auto");
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='First Name']")).sendKeys("Mekala");
		driver.findElement(By.xpath("//input[@type='text'and @placeholder='Last Name']")).sendKeys("P");
		driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys("P velur,Namakkal,karur");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("auto@gmail.com");
		driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys("9834567823");
		String gender = "Female";
		String act_gender = gender.toLowerCase();
		switch (act_gender) {
		case "male":
			driver.findElement(By.xpath("//*[@value='Male']")).click();
			break;
		case "female":
			driver.findElement(By.xpath("//*[@value='FeMale']")).click();
			break;
		default:
			System.out.println("Gender input value is invalid: " + act_gender);
		}
		boolean criketstatus = driver.findElement(By.xpath("//input[@type='checkbox' and @value='Cricket']"))
				.isSelected();
		if (criketstatus == false) {
			driver.findElement(By.xpath("//input[@type='checkbox' and @value='Cricket']")).click();
		}
		boolean moviesstatus = driver.findElement(By.xpath("//input[@type='checkbox' and @value='Movies']"))
				.isSelected();
		if (moviesstatus == false) {
			driver.findElement(By.xpath("//input[@type='checkbox' and @value='Movies']")).click();
		}
		boolean hockeystatus = driver.findElement(By.xpath("//input[@type='checkbox' and @value='Hockey']"))
				.isSelected();
		if (hockeystatus == false) {
			driver.findElement(By.xpath("//input[@type='checkbox' and @value='Hockey']")).click();
		}

		driver.findElement(By.xpath("//*[@id='msdd']")).click();
		driver.findElement(By.xpath("//a[text()='Arabic']")).click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
		driver.findElement(By.xpath("//a[text()='Dutch']")).click();
		Select dropdown = new Select(driver.findElement(By.id("Skills")));
		dropdown.selectByVisibleText("Analytics");
		Select dropdown1 = new Select(driver.findElement(By.id("countries")));
		dropdown1.selectByVisibleText("Select Country");
		driver.findElement(By.xpath("//*[@role='combobox']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		Select dropdown2 = new Select(driver.findElement(By.id("yearbox")));
		dropdown2.selectByIndex(4);
		Select dropdown3 = new Select(driver.findElement(By.xpath("//*[@placeholder='Month']")));
		dropdown3.selectByVisibleText("January");
		Select dropdown4 = new Select(driver.findElement(By.id("daybox")));
		dropdown4.selectByIndex(4);
		driver.findElement(By.xpath("//input[@id= 'firstpassword']")).sendKeys("mekalameka");
		driver.findElement(By.xpath("//input[@id = 'secondpassword']")).sendKeys("mekalameka");
		// driver.quit();

	}

}
