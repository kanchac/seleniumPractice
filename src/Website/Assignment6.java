package Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91843\\Downloads\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
//		WebElement chkbox = driver.findElement(By.tagName("value=option1"));
		String value = "option1";
//		String message ="Hello option1, share this practice page and share your knowledge";

		driver.findElement(By.id("checkBoxOption1")).click();
		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByValue(value);
		driver.findElement(By.id("name")).sendKeys(value);
		driver.findElement(By.id("alertbtn")).click();
		String text=  driver.switchTo().alert().getText();
		System.out.println("string text is:" + text);
		
        if(text.contains(value))
        {
          System.out.println("Alert message success");
        }
        else
        System.out.println("Something wrong with execution");

		
//		Assert.assertEquals(driver.switchTo().alert().getText(), "Hello " +value+ "," );
	

		driver.switchTo().alert().accept();
		driver.close();
		


	}

}
