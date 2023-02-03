package Website;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ssl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91843\\Downloads\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
//		manage cookies 
//		driver.manage().deleteAllCookies();
//		driver.manage().deleteCookieNamed("sessionkey");
		
		System.out.println(driver.getTitle());
		driver.close();
		
		
		

	}

}
