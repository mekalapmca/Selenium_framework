
package testNGdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StringCompare {

  @Test
  public void verifyapplicationtitleTest() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	  //Actual title
	  String my_title=driver.getTitle();
	  System.out.println("Title is" +my_title);
String expected_title="";
Assert.assertEquals(my_title, expected_title);
Assert.assertTrue(my_title.contains("selenium webdriver"));
System.out.println("Test completed page verified");
	  
    
  }
}
