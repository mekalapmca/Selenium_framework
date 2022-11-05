package com.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_steps {
	WebDriver driver=null;
	@Given("Launch chrome browser and Enter URL")
	public void launch_chrome_browser_and_enter_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(20));
		driver.get("https://www.google.com");
	}

	@When("Search for any product in google search box")
	public void search_for_any_product_in_google_search_box() {
		WebElement a = driver.findElement(By.xpath("//input[@name='q']"));
		a.sendKeys("automation");
		a.sendKeys(Keys.ENTER);
			}
	
	@When("Search for any {string} in google search box")
	public void search_for_any_in_google_search_box(String productname) {
		WebElement a = driver.findElement(By.xpath("//input[@name='q']"));
		a.sendKeys(productname);
		a.sendKeys(Keys.ENTER);
	}

	@Then("Close the browser")
	public void close_the_browser() {
	    driver.close();
	}

	@When("Search for any product {string} in google search box")
	public void search_for_any_product_in_google_search_box(String multi) {
		WebElement a = driver.findElement(By.xpath("//input[@name='q']"));
		a.sendKeys(multi);
		a.sendKeys(Keys.ENTER);
	}
}
