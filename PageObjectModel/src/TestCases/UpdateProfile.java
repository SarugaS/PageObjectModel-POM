package TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObjects.LoginPageObjects;
import PageObjects.UpdateProfileObjects;

public class UpdateProfile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		LoginPageObjects.username(driver).sendKeys("Admin");
		LoginPageObjects.password(driver).sendKeys("admin123"+Keys.ENTER);
		Thread.sleep(3000);
		
		UpdateProfileObjects.myinfo(driver).click();
		Thread.sleep(3000);

		UpdateProfileObjects.Firstname(driver).sendKeys("John");
		UpdateProfileObjects.employeeId(driver).sendKeys("1234");
		UpdateProfileObjects.save(driver).click();
		Thread.sleep(3000);
		
		driver.quit();


	}

}
