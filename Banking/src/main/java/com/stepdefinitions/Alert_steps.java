package com.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Library.SeleniumLibrary;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_steps {
	WebDriver driver = null;
	@Given("Enter the URL")
	public void enter_the_url() {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().window().maximize();
		 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	}

	@When("Handling alert box")
	public void handling_alert_box() {
		//driver.switchTo().frame("iframeResult");
		
		//WebElement iframe=driver.findElement(By.xpath("//*[@onclick='myFunction()']"));
		SeleniumLibrary.swithchtoframe_string(driver,"iframeResult" );
		driver.findElement(By.xpath("//*[@onclick='myFunction()']")).click();
	}

	@Then("Close the alert box")
	public void close_the_alert_box() {
	   // driver.close();
	}

}
