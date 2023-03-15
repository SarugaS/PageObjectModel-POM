package TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

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
		
		PageFactory.initElements(driver, LoginPageObjects.class);

		LoginPageObjects.username.sendKeys("Admin");
		LoginPageObjects.password.sendKeys("admin123"+Keys.ENTER);
		Thread.sleep(3000);
		
		PageFactory.initElements(driver, UpdateProfileObjects.class);
		
		UpdateProfileObjects.myinfo.click();
		Thread.sleep(3000);

		UpdateProfileObjects.Firstname.sendKeys("John");
		UpdateProfileObjects.employeeId.sendKeys("1234");
		UpdateProfileObjects.save.click();
		Thread.sleep(3000);
		
		driver.quit();


	}

}
