package Website;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91843\\Downloads\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
//		driver.get("https://www.booking.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//div[contains(@data-mode,'checkin')]//div[contains(@class,'-empty sb-date__field-svg_icon')]")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1100)");
		Thread.sleep(5000);
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		Thread.sleep(5000);

		while(!driver.findElement(By.cssSelector("[class='flatpickr-month'] [class='flatpickr-current-month'] [class='cur-month']")).getText().contains("May"))
		{
			driver.findElement(By.xpath("//span[@class='flatpickr-next-month']//*[name()='svg']")).click();
			Thread.sleep(2000);
		}
		
		
		List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
		//Grab common attribute//Put into list and iterate
		int count = dates.size();
		for(int i=0;i<count;i++)
		{
			String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
			if(text.equalsIgnoreCase("25"))
			{
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				break;
			}
		}
		driver.close();

	}

}
