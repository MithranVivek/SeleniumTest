package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCheck {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\eclipse-vivek\\SeleniumTest\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com/");
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("hema2vivek@gmail.com");
		
		String attribute = user.getAttribute("value");
		System.out.println(attribute);
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("Dhivya@123");
		
		String attributepass = pass.getAttribute("value");
		System.out.println(attributepass);
		
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}

}
