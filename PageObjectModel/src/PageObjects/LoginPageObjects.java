package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {

	//username,password,submit

	@FindBy(name="username")
	public static WebElement username;
	@FindBy(name= "password")
	public static WebElement password;


}

