package org.testing;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\eclipse-vivek\\SeleniumTest\\Drivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://demo.guru99.com/test/drag_drop.html");
				driver.manage().window().maximize();
				WebElement Drag1= driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
				WebElement Drop1= driver.findElement(By.xpath("//li[contains(@class,'placeholder')][1]"));
								
				Actions ac1=new Actions(driver);
				ac1.dragAndDrop(Drag1, Drop1).build().perform();
				
				TakesScreenshot rc1=(TakesScreenshot)driver;
				
				File srcrc1 =rc1.getScreenshotAs(OutputType.FILE);
				File locationrc1= new File("D:\\ScreenShot\\dragdrop1.png");
				FileUtils.copyFile(srcrc1, locationrc1);
				
				WebElement Drag2= driver.findElement(By.xpath("//li[@id='fourth'][1]"));
				WebElement Drop2= driver.findElement(By.xpath("//li[contains(@class,'placeholder')][1]"));
								
				Actions ac2=new Actions(driver);
				ac2.dragAndDrop(Drag2, Drop2).build().perform();
				
				TakesScreenshot rc2=(TakesScreenshot)driver;
				
				File srcrc2 =rc2.getScreenshotAs(OutputType.FILE);
				File locationrc2= new File("D:\\ScreenShot\\dragdrop2.png");
				FileUtils.copyFile(srcrc2, locationrc2);
				
				WebElement Drag3= driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
				WebElement Drop3= driver.findElement(By.xpath("//li[contains(@class,'placeholder')][1]"));
								
				Actions ac3=new Actions(driver);
				ac3.dragAndDrop(Drag3, Drop3).build().perform();
				
				TakesScreenshot rc3=(TakesScreenshot)driver;
				
				File srcrc3 =rc3.getScreenshotAs(OutputType.FILE);
				File locationrc3= new File("D:\\ScreenShot\\dragdrop3.png");
				FileUtils.copyFile(srcrc3, locationrc3);
				
				WebElement Drag4= driver.findElement(By.xpath("//li[@id='fourth'][2]"));
				WebElement Drop4= driver.findElement(By.xpath("//li[contains(@class,'placeholder')][1]"));
								
				Actions ac4=new Actions(driver);
				ac4.dragAndDrop(Drag4, Drop4).build().perform();
				
				TakesScreenshot rc4=(TakesScreenshot)driver;
				
				File srcrc4 =rc4.getScreenshotAs(OutputType.FILE);
				File locationrc4= new File("D:\\ScreenShot\\dragdrop4.png");
				FileUtils.copyFile(srcrc4, locationrc4);
				 
				
				
	}
}
