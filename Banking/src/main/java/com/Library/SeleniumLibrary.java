package com.Library;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLibrary {

	public static void Lanch_Browser(String browsername, WebDriver driver) {
		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
	}

	public static void SelectItemFromDropdown(WebElement dropdownelement, String dropdowntext) {   //stepdef_facebook program
		try {
			Select dropdown = new Select(dropdownelement);
			dropdown.selectByVisibleText(dropdowntext);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void SelectItemFromDropdown(WebElement dropdownelement, int index) {     //stepdef_facebook program
		try {

			Select dropdown = new Select(dropdownelement);
			dropdown.selectByIndex(index);

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	public static void swithchtoframe_element(WebDriver driver, WebElement iframe) {

		try {
			driver.switchTo().frame(iframe);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void swithchtoframe_string(WebDriver driver, String iframename) {  //stepdef_alert program

		try {
			driver.switchTo().frame(iframename);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void swithchtoframe_index(WebDriver driver, String iframeindex) {   

		try {
			driver.switchTo().frame(iframeindex);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void Enterdatato_textbox(WebElement textbox_element, String data) {   //stepdef_facebook program
		try {
			textbox_element.sendKeys(data);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void SelectTo_Radiobutton(WebElement radiobutton_element) {  //stepdef_facebook program
		try {
			radiobutton_element.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void SelectTo_Checkboxbutton(WebElement checkbox_element) {  //checkbox1 program
		try {
			boolean status= checkbox_element.isSelected();
			if(status==false) {
				checkbox_element.click();
			}else {
				System.out.println("checkbox is already selected");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	//mousehover method
	public static void MousehoverTo_element(WebDriver driver,WebElement mousehover_element ){ 
		try {
			Actions action = new Actions(driver);
			action.moveToElement(mousehover_element).build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void capture_screen(WebDriver driver, String path,String Screenshotname) throws IOException {
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(path+"//"+Screenshotname+".png"));
	}

	public static void draganddrop_element(WebDriver driver, WebElement from, WebElement To) {
		Actions act = new Actions(driver);
		act.dragAndDrop(from, To).build().perform();
	}

}
