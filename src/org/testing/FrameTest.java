package org.testing;

import java.awt.Desktop.Action;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameTest {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\eclipse-vivek\\SeleniumTest\\Drivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
				driver.manage().window().maximize();
				
				driver.switchTo().frame("frame1");
				driver.switchTo().frame("frame3");
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();
				
				driver.switchTo().parentFrame();
				 String text = driver.findElement(By.xpath("//b[@id='topic']")).getText();
				 System.out.println(text);
				 
				driver.switchTo().defaultContent();
				String text2 = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
				System.out.println(text2);
				
				driver.switchTo().frame("frame2");
				WebElement drop=driver.findElement(By.xpath("//select[@id='animals']"));
				drop.click();
				Select sl= new Select(drop);
				
				boolean multi= sl.isMultiple();
				System.out.println(multi);
				
				sl.selectByIndex(2);
				
				TakesScreenshot tk= (TakesScreenshot)driver;
				File scr= tk.getScreenshotAs(OutputType.FILE);
				File location= new File("D:\\ScreenShot\\Frame.png");
				FileUtils.copyFile(scr, location);
				
	}	
}
