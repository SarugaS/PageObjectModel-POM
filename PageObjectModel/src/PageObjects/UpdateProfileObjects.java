package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateProfileObjects {


	public static WebElement myinfo(WebDriver driver) {
		WebElement myinfo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a"));
		return myinfo;
	}

	public static WebElement Firstname(WebDriver driver) {
		WebElement Firstname = driver.findElement(By.name("firstName"));
		return Firstname;

	}
	public static WebElement employeeId(WebDriver driver) {
		WebElement employeeId = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
		return employeeId;
		
	}
	public static WebElement save(WebDriver driver) {
		WebElement save = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button"));
		return save;
		
	}
}
