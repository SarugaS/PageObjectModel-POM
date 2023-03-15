package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	
	//username,password,submit
	
	public static WebElement username(WebDriver driver) {
		WebElement username = driver.findElement(By.name("username"));
		return username;
	}
	
	public static WebElement password(WebDriver driver) {
		WebElement password = driver.findElement(By.name("password"));
		return password;
		
	}
	
}
