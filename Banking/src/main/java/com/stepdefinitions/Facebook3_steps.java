package com.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Library.SeleniumLibrary;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook3_steps {
	WebDriver driver = null;

	@Given("Launch chrome browser and Enter Facebook URL")
	public void launch_chrome_browser_and_enter_facebook_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
	}

	@When("Verify the facebook user registration")
	public void verify_the_facebook_user_registration() {
		driver.findElement(By.xpath("//a[contains(text(),'New Account')]")).click();
		WebElement username_element= driver.findElement(By.xpath("//input[@name='firstname']"));
		SeleniumLibrary.Enterdatato_textbox(username_element, "Mekala");
		
		//driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("P");
		WebElement textbox=driver.findElement(By.xpath("//input[@name='lastname']"));
	    SeleniumLibrary.Enterdatato_textbox(textbox, "automation"); //enter text using resuable method
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9846738268");
		/*
		 * Select dropdown5 = new
		 * Select(driver.findElement(By.xpath("//*[@id='day']")));
		 * dropdown5.selectByIndex(5); Select dropdown6 = new
		 * Select(driver.findElement(By.xpath("//*[@title='Month']")));
		 * dropdown6.selectByIndex(6); Select dropdown7 = new
		 * Select(driver.findElement(By.xpath("//*[@name='birthday_year']")));
		 * dropdown7.selectByIndex(14);
		 */
		WebElement daydropdown=driver.findElement(By.xpath("//*[@id='day']"));
		SeleniumLibrary.SelectItemFromDropdown(daydropdown, 5);
		
		WebElement monthdropdown=driver.findElement(By.xpath("//*[@title='Month']"));
		SeleniumLibrary.SelectItemFromDropdown(monthdropdown, "Jun");
		
		WebElement yeardropdown=driver.findElement(By.xpath("//*[@name='birthday_year']"));
		SeleniumLibrary.SelectItemFromDropdown(yeardropdown, 14);
		
		
		
		
		String gender = "Female";
		if (gender.equalsIgnoreCase("Male")) {
		//driver.findElement(By.xpath("//input[@value='2']")).click();
			WebElement radiobutton=driver.findElement(By.xpath("//input[@value='2']"));
			SeleniumLibrary.SelectTo_Radiobutton(radiobutton);

		} else if (gender.equalsIgnoreCase("Female")) {
			WebElement radiobutton1=driver.findElement(By.xpath("//input[@value='1']"));
			SeleniumLibrary.SelectTo_Radiobutton(radiobutton1);
		} else if (gender.equalsIgnoreCase("Custom")) {
			WebElement radiobutton2=driver.findElement(By.xpath("//input[@value='-1']"));
			SeleniumLibrary.SelectTo_Radiobutton(radiobutton2);
		} else {
			System.out.println("Gender input value is invalid: " + gender);
		}
	}
	
	@When("Verify the facebook user registration with {string},{string},{string},{string},{string},{string}")
	public void verify_the_facebook_user_registration_with(String firstname, String lastname, String phonenumber, String passwd, String dob, String act_gender) {
		driver.findElement(By.xpath("//a[contains(text(),'New Account')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys(phonenumber);
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys(passwd);
		String[] date_of_birth= dob.split("/");
		Select dropdown5 = new Select(driver.findElement(By.xpath("//*[@id='day']")));
		dropdown5.selectByVisibleText(date_of_birth[0]);
		Select dropdown6 = new Select(driver.findElement(By.xpath("//*[@title='Month']")));
		dropdown6.selectByVisibleText(date_of_birth[1]);
		Select dropdown7 = new Select(driver.findElement(By.xpath("//*[@name='birthday_year']")));
		dropdown7.selectByVisibleText(date_of_birth[2]);
		String gender = act_gender;
		if (gender.equalsIgnoreCase("Male")) {
			driver.findElement(By.xpath("//input[@value='2']")).click();

		} else if (gender.equalsIgnoreCase("Female")) {
			driver.findElement(By.xpath("//input[@value='1']")).click();
		} else if (gender.equalsIgnoreCase("Custom")) {
			driver.findElement(By.xpath("//input[@value='-1']")).click();
		} else {
			System.out.println("Gender input value is invalid: " + gender);
		}
	}

	@Then("Close the Browser")
	public void close_the_browser() {
		//driver.close();
	}

	@When("Verify the facebook user registration with data {string},{string},{string},{string},{string},{string}")
	public void verify_the_facebook_user_registration_with_data(String firstname, String lastname, String phonenumber, String passwd, String dob, String gender) {
		driver.findElement(By.xpath("//a[contains(text(),'New Account')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys(phonenumber);
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys(passwd);
		String[] date_of_birth= dob.split("/");
		Select dropdown5 = new Select(driver.findElement(By.xpath("//*[@id='day']")));
		dropdown5.selectByVisibleText(date_of_birth[0]);
		
		Select dropdown6 = new Select(driver.findElement(By.xpath("//*[@title='Month']")));
		dropdown6.selectByVisibleText(date_of_birth[1]);
		Select dropdown7 = new Select(driver.findElement(By.xpath("//*[@name='birthday_year']")));
		dropdown7.selectByVisibleText(date_of_birth[2]);
		if (gender.equalsIgnoreCase("Male")) {
			driver.findElement(By.xpath("//input[@value='2']")).click();

		} else if (gender.equalsIgnoreCase("Female")) {
			driver.findElement(By.xpath("//input[@value='1']")).click();
		} else if (gender.equalsIgnoreCase("Custom")) {
			driver.findElement(By.xpath("//input[@value='-1']")).click();
		} else {
			System.out.println("Gender input value is invalid: " + gender);
		}
	
 
	}

}
