package org.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PraveenTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\eclipse-vivek\\SeleniumTest\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement search=driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("MI mobiles");
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(5000);
		List<WebElement> redmi=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		for(int i=0;i<3;i++) {
			WebElement name=redmi.get(i);
			String text=name.getText();
			System.out.println(text);
		}
		System.err.println("-Print 3rd Element-");
		WebElement name = redmi.get(2);
		String rd=name.getText();
		System.out.println(rd);
		
	
		
	}
}
