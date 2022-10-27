package org.testing;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VirtualKeyBoard {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\eclipse-vivek\\SeleniumTest\\Drivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com");
				driver.manage().window().maximize();
				
				WebElement user= driver.findElement(By.xpath("//input[@id='email']"));
				
				user.sendKeys("vivekbabu");
				Actions mouse=new Actions(driver);
				mouse.doubleClick(user).build().perform();
				mouse.contextClick().build().perform();
				
				Robot select=new Robot();
				
				for(int i=0;i<2;i++) {
				select.keyPress(KeyEvent.VK_DOWN);
				select.keyRelease(KeyEvent.VK_DOWN);
				}
				select.keyPress(KeyEvent.VK_ENTER);
				select.keyRelease(KeyEvent.VK_ENTER);
				WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
				pass.click();
				select.keyPress(KeyEvent.VK_CONTROL);
				select.keyPress(KeyEvent.VK_V);
				select.keyRelease(KeyEvent.VK_CONTROL);
				select.keyRelease(KeyEvent.VK_V);
				
	}
}
