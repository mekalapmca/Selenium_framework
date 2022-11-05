package com.stepdefinitions;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon2_steps {
	WebDriver driver = null;
	String parentwindow = null;
	boolean switch_status = false;
	String exp_windowTitle = "Apple iPhone 13 Pro (128GB) - Sierra Blue : Amazon.in: Electronics";
	@Given("Enter the amazon URL")
	public void enter_the_amazon_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		parentwindow = driver.getWindowHandle();
		System.out.println("parent window name:" + parentwindow);
	}

	@When("Search the product {string}")
	public void search_the_product(String productname) {
		WebElement a = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		a.sendKeys(productname);
		a.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//img[@alt='Sponsored Ad - Apple iPhone 13 Pro (128GB) - Sierra Blue']")).click();
	}

	@When("product detail page open")
	public void product_detail_page_open() {
		Set<String> allwindows = driver.getWindowHandles();
		for (String windoName : allwindows) {
			System.out.println(windoName);
			if (windoName.equals(parentwindow) == false) {
				driver.switchTo().window(windoName);
				String act_windowTitle = driver.getTitle();
				if (act_windowTitle.equals(exp_windowTitle)) {
					switch_status = true;
					break;
				}
			}
		}
		System.out.println(switch_status);
		if (switch_status == true) {
			System.out.println("We are in the iphone 13pro page");
		}
	}

	@Then("close the amazon browser")
	public void close_the_amazon_browser() {
		driver.quit();

	}
}
