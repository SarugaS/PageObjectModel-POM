package PageFactoryWithoutAnnotation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class LoginWithoutFindBy {
	
	static WebElement username;
	static WebElement password;
	
	@Test
	public void LogIn() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		PageFactory.initElements(driver, LoginWithoutFindBy.class);
		
		username.sendKeys("Admin");
		password.sendKeys("admin123"+Keys.ENTER);
		
		driver.quit();
	}
}

