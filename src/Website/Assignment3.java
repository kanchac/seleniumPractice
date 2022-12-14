package Website;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//label[@class='customradio'])[2]")).click();
//		Thread.sleep(3000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".modal-content")));
		driver.findElement(By.id("okayBtn")).click();
		driver.findElement(By.cssSelector("select[class='form-control']")).click();
		driver.findElement(By.cssSelector("option[value='consult']")).click();
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.cssSelector(".col-lg-3"));
		Assert.assertTrue(driver.findElement(By.cssSelector(".col-lg-3")).isDisplayed());
		Thread.sleep(3000);
		
		List<WebElement> product = driver.findElements(By.cssSelector(".col-lg-3"));
		for(int i=0; i<product.size()-1;i++)
		{
			driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();

		}
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());

		driver.close();
		}

}
