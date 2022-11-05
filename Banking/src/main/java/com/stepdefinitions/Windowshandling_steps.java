package com.stepdefinitions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowshandling_steps {
	WebDriver driver=null;
	String parentwindow=null;
	boolean switch_status=false;
	String exp_windowTitle="Register - PHPTRAVELS";
	@Given("open the travel website URL")
	public void open_the_travel_website_url() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/demo");
		parentwindow=driver.getWindowHandle();
		System.out.println("parent window name:" + parentwindow);
	}

	@When("Entering into signup page")
	public void entering_into_signup_page() {
		driver.findElement(By.linkText("Sign Up")).click();
	}

	@When("Handling multiple windows")
	public void handling_multiple_windows() {
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
		
	}

	@Then("close the testing")
	public void close_the_testing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
