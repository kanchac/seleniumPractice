package Website;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Id {

	public static void main(String[] args) {
//		SeleniumManager		
		//test
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91843\\Downloads\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]")).click();
		WebElement Unm = driver.findElement(By.id("email"));
		//class variable = instanceobject.method(class.locator(value));
		System.out.println(Unm.getAttribute("id"));
		System.out.println(Unm.getTagName());
		Unm.sendKeys("kanchan_chaudhari@rocketmail.com");
		driver.findElement(By.name("pass")).sendKeys("Sweet30!");
		driver.findElement(By.name("login")).click();
		driver.close();

	}

}
