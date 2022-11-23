package Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91843\\Downloads\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")).click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		System.out.println("Back Done...");
		
		driver.navigate().forward();
		Thread.sleep(1000);
		System.out.println("Forward Done...");
		
		driver.navigate().refresh();
		System.out.println("Refresh Done...");
		}

}
