package com.seleniumprograms;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductSelect {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("mekala1845@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("mekalameka");
		driver.findElement(By.xpath("//*[@id='SubmitLogin']")).click();
		driver.findElement(By.xpath("//a[text()='Women']")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Tops') and @class='img'] "));
		/*
		 * driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		 * driver.findElement(By.linkText("Women")).click();
		 */
		/*
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img")).click();
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img")).click();
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")).click();
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")).click();
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")).click();
		 */
	}

}
