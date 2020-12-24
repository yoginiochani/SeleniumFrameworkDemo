package objectMethods;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePagePO;

public class HomePageOM {

	public void signIn(WebDriver driver, String u, String p)
	{
		HomePagePO obj = new HomePagePO();
		obj.email_txtbox(driver).sendKeys(u);  //passing the parameter,
		obj.password_txtbox(driver).sendKeys(p);
	}
}
