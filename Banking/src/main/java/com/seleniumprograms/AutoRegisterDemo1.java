package com.seleniumprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoRegisterDemo1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Mekala");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("p");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"))
				.sendKeys("p.velur,namakkal");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("automation123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("98346712347");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		WebElement e = driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
		e.click();
		WebElement list = driver
				.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul"));

		List<WebElement> list1 = list.findElements(By.tagName("li"));
		for (WebElement option : list1) {
			if (option.getText().equals("English") || option.getText().equals("Arabic")) {
				System.out.println(option.getText());
				option.click(); // click the desired option

			}
		}
		Select dropdown = new Select(driver.findElement(By.id("Skills")));
		dropdown.selectByVisibleText("Android");
		Select dropdown1 = new Select(driver.findElement(By.id("countries")));
		dropdown1.selectByVisibleText("Select Country");
		// driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
		WebElement list2 = driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]"));
		List<WebElement> country = list2.findElements(By.tagName("li"));
		for (WebElement option : country) {
			if (option.getText().equals("India")) {
				System.out.println(option.getText());
				option.click();
				break;// click the desired option

			}
		}

		Select dropdown2 = new Select(driver.findElement(By.id("yearbox")));
		dropdown2.selectByIndex(2);

		Select dropdown3 = new Select(
				driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
		dropdown3.selectByIndex(2);

		Select dropdown4 = new Select(driver.findElement(By.id("daybox")));
		dropdown4.selectByIndex(2);

		driver.findElement(By.id("firstpassword")).sendKeys("mekala");
		driver.findElement(By.id("secondpassword")).sendKeys("automate");
	}
}
