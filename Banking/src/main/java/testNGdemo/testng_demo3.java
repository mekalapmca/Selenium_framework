package testNGdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testng_demo3 {

	@Test(priority = 1)
	public void startApp() {
		System.out.println("startApp method");
	}

	@Test(priority = 2, dependsOnMethods = "startApp")
	public void login() {
		System.out.println("login method");

	}

	@Test(priority = 3, dependsOnMethods = { "startApp", "login" })
	public void logout() {
		System.out.println("logout method");
	}

	@Test(priority = 4, dependsOnMethods = { "startApp", "login", "logout" })
	private void close() {
		System.out.println("close method");

	}
}
