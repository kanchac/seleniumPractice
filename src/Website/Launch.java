package Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriverService;

public class Launch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91843\\Downloads\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver= new ChromeDriver(new ChromeDriverService.Builder().usingPort(8080).build());
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.findElement(By.id("identifierId")).sendKeys("kanchanchaudhari94@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		
		driver.close();

	}

}
