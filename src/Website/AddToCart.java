package Website;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

//	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(5));
		
		String[] productsNeeded = {"Beans", "Cucumber", "Tomato"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		addItems(driver, productsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
//		Explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
		driver.close();
	}
	
	public static void addItems(WebDriver driver, String[] productsNeeded)
	{
		int j=0;
//		take all elements into the array by product name
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0; i<product.size();i++)
		{
			
			//Brocolli - 1 Kg 
			//split it on '-'
			//Brocolli ,    1 kg
			String[] name= product.get(i).getText().split("-");
			String formattedName=name[0].trim();
			// trim will remove all blank spaces
			//format it to get actual vegetable name
//			Convert productsNeeded array into list
			List<String> productsNeededList = Arrays.asList(productsNeeded);
		//  check whether name you extracted is present in arrayList or not-
			if(productsNeededList.contains(formattedName))
			{
				j++;
				//click on Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==productsNeeded.length)

				{

				break;
			}
		}
		


		
	}

}
}
