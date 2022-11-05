package testNGdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Library.SeleniumLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDropdemo {
	WebDriver driver = null;

	@Test
	public void debitdragndrop() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement from = driver.findElement(By.xpath("//*[@id='credit2']/a"));
		WebElement To = driver.findElement(By.xpath("//*[@id='bank']/li"));
		/*
		 * Actions act = new Actions(driver); act.dragAndDrop(from,
		 * To).build().perform();
		 */
		SeleniumLibrary.draganddrop_element(driver, from, To);
		WebElement from1 = driver.findElement(By.xpath("//*[@id='fourth' and @data-id='2'][1]"));
		WebElement To1 = driver.findElement(By.xpath("//*[@id='amt7']"));
		SeleniumLibrary.draganddrop_element(driver, from1, To1);
		//Actions act1 = new Actions(driver);
		//act1.dragAndDrop(from1, To1).build().perform();
	}

	@Test(dependsOnMethods = "debitdragndrop")
	public void creaditdragndrop() {
		WebElement from2 = driver.findElement(By.xpath("//*[@id='credit1']"));
		WebElement To2 = driver.findElement(By.xpath("//*[@id='loan']"));
		Actions act2 = new Actions(driver);
		act2.dragAndDrop(from2, To2).build().perform();
		WebElement from3 = driver.findElement(By.xpath("//*[@id='fourth' and @data-id='2'][2]"));
		WebElement To3 = driver.findElement(By.xpath("//*[@id='amt8']"));
		Actions act3 = new Actions(driver);
		act3.dragAndDrop(from3, To3).build().perform();

	}

}
