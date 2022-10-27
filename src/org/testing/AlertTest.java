package org.testing;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\eclipse-vivek\\SeleniumTest\\Drivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://demoqa.com/alerts");
				driver.manage().window().maximize();
				
				Robot zo=new Robot();
				
					zo.keyPress(KeyEvent.VK_CONTROL);
					zo.keyPress(KeyEvent.VK_MINUS);
					zo.keyRelease(KeyEvent.VK_MINUS);
					zo.keyPress(KeyEvent.VK_MINUS);
					zo.keyRelease(KeyEvent.VK_MINUS);
					zo.keyRelease(KeyEvent.VK_CONTROL);
				
				
				WebElement simple= driver.findElement(By.xpath("//button[contains(@id,'alertButton')]"));
				simple.click();
				
				Alert a=driver.switchTo().alert();
				a.accept();
				
			    WebElement confirm= driver.findElement(By.xpath("//button[contains(@id,'confirmButton')]"));
	  		     confirm.click();
				a.dismiss();
				WebElement text = driver.findElement(By.xpath("//span[@id='confirmResult']"));
				String cr=text.getText();
				System.out.println(cr);
				Thread.sleep(3000);
			
				WebElement prompt= driver.findElement(By.xpath("//button[contains(@id,'promtButton')]"));
				prompt.click();
				a.sendKeys("vivek");
				a.accept();
				
				Thread.sleep(3000);
				
				WebElement text1 = driver.findElement(By.xpath("//span[@id='promptResult']"));
				String s=text1.getText();
				System.out.println(s);
				
							
				
	}
}
