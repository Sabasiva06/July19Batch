package org.day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserLaunch {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sabas\\eclipse-workspace\\Sel July 7.30pm\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstech.in/selenium-course-content.html");

		WebElement scrollDown = driver.findElement(By.xpath("//h3[contains(text(),'Inheritance')]"));

		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);

		WebElement scrollUp = driver.findElement(By.xpath("//div[text()='Courses ']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false)", scrollUp);
		

		WebElement scrollUp1 = driver.findElement(By.xpath("//div[text()='Courses ']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false)", scrollUp1);
		

		WebElement scrollUp3 = driver.findElement(By.xpath("//div[text()='Courses ']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false)", scrollUp3);
		
		
		
		
	}

}
