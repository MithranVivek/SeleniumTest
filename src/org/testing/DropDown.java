package org.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\eclipse-vivek\\SeleniumTest\\Drivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
				driver.manage().window().maximize();
				
				//Single Drop Selector
				
				WebElement single=driver.findElement(By.xpath("//select[contains(@id,'first')]"));
				Select s=new Select(single);
				boolean multiple=s.isMultiple();
				System.out.println("This drop is Multiple selector="+multiple);
				System.out.println("------------------------------------------");
				List<WebElement> options = s.getOptions();
				
				System.out.println("Available options are ");

				
				for(int i=0;i<options.size();i++) {
					
					WebElement option= options.get(i);
					String op=option.getText();
					System.out.println(op);
					
					if(op.equals("Google")) {
						s.selectByValue(op);
						System.out.println("your selected option is " + op);
					}
				}
					System.out.println("______________________________________________");
					
					
				//Multiple Drop Selector
					
					WebElement multi=driver.findElement(By.xpath("//select[contains(@id,'second')]"));
					Select sl=new Select(multi);
					boolean multiple1=sl.isMultiple();
					System.out.println("This drop is Multiple selector="+ multiple1);
					System.out.println("------------------------------------------");
					sl.selectByIndex(1);
					sl.selectByIndex(3);
					sl.selectByIndex(0);
					
									
					List<WebElement> options1=sl.getOptions();
					for(int j=0;j<options1.size();j++) {
						WebElement option1 =options1.get(j);
						String op1=option1.getText();
						if(op1.equals("Pizza")) {
							System.out.println("your option selected also ");
						System.out.println(op1);
						}
					}
				}
}
