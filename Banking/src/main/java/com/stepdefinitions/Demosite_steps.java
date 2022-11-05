package com.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demosite_steps {
	WebDriver driver = null;

	@Given("open demo site to enter details")
	public void open_demo_site_to_enter_details() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-admin/install.php");

	}

	@When("enter all form details")
	public void enter_all_form_details() {
		driver.findElement(By.xpath("//input[@name='weblog_title']")).sendKeys("automation");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("mekala");
		driver.findElement(By.xpath("//input[@id='pass1']")).sendKeys("Automation@125");
		driver.findElement(By.xpath("//input[@id='admin_email']")).sendKeys("auto@gmail.com");
		boolean status=driver.findElement(By.xpath("//input[@id='blog_public']")).isSelected();
		if(status==false) {
			driver.findElement(By.xpath("//input[@id='blog_public']")).click();
		}
	}

	@Then("close when finished")
	public void close_when_finished() {
		driver.close();
	}

}
