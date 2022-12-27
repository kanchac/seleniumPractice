package Website;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//1. Give me the count of links on the page.
				//2. Count of footer section-
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91843\\Downloads\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); //limiting webdriver scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//3-
		WebElement column = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(column.findElements(By.tagName("a")).size());
		
		//4- click on each link in the coloumn and check if the pages are opening-
		for(int i=0;i<column.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			column.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(5000);
			
		}	//opens all tabs
			Set<String> w= driver.getWindowHandles(); // (parentid, childid)
			Iterator<String> it = w.iterator();
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getCurrentUrl());

			}
			
//			driver.navigate().back();
		
		
		
		driver.quit();
	}

}
