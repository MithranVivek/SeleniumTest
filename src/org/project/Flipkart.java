package org.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\eclipse-vivek\\SeleniumTest\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.flipkart.com");
		WebElement click= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		click.click();
		WebElement search=driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("MI mobiles");
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(5000);
		List<WebElement> redmi=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		for(int i=0;i<redmi.size();i++) {
			WebElement name=redmi.get(i);
			String text=name.getText();
			System.out.println(text);
		}
		WebElement cart=driver.findElement(By.xpath("//a[@class='_3SkBxJ']"));
		cart.click();
		Thread.sleep(5000);
		WebElement carteneble=driver.findElement(By.xpath("//div[contains(text(),'Missing Cart items?')]"));
		String missing=carteneble.getText();
		System.out.println(missing);
		
		boolean s=missing.equals("Missing Cart items?");
		System.out.println(s);
		if (s==true) {
			System.out.println("printed");
		}
		else {
			System.out.println("not printed");
		}	
			
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		WebElement fourgb=driver.findElement(By.xpath("//div[contains(text(),'4 GB')]"));
		fourgb.click();
		Thread.sleep(2000);
		boolean f=fourgb.isSelected();
		System.out.println(f);
		Thread.sleep(3000);
		WebElement internalstorage=driver.findElement(By.xpath("//div[contains(text(),'Internal Storage')]"));
		internalstorage.click();
		Thread.sleep(5000);
		WebElement sfgb=driver.findElement(By.xpath("//div[contains(text(),'64 - 127.9 GB')]"));
		sfgb.click();
		
		
	}
}
