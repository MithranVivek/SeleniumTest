
package org.testing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandleTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\eclipse-vivek\\SeleniumTest\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.flipkart.com");
		WebElement into=driver.findElement(By.xpath("//button[text()='✕']"));
				into.click();
	 	WebElement text=driver.findElement(By.xpath("//input[@type='text']"));
			text.sendKeys("samsung mobiles",Keys.ENTER);
		Thread.sleep(2000);
		String parant = driver.getWindowHandle();
       
        driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
        driver.switchTo().window(parant);
        driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
        driver.switchTo().window(parant);
        driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();
        driver.switchTo().window(parant);
        driver.findElement(By.xpath("(//div[@class='_4rR01T'])[4]")).click();
        driver.switchTo().window(parant);
        
        Set<String> child = driver.getWindowHandles();
        List<String> child1=new ArrayList<>(child);
        for(int i=1;i<=4;i++) {
        	driver.switchTo().window(child1.get(i));
        String text1 = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
        System.out.println(text1);
        }
		}
	
}
