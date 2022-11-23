package Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		String[] Products = {"Beans", "Cucumber", "Tomato"};
//		take all elements into the array by product name
		driver.findElement(By.xpath("h4.product-name"));
		

		
	}

}
