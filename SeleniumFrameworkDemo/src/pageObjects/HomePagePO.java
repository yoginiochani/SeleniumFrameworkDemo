package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePagePO {

	public WebDriver driver;
	public WebElement ele;
	
	public WebElement email_txtbox(WebDriver driver)   //creating methods for each elements
	{
	ele = driver.findElement(By.id("email"));
	return ele;
	}
	
	public WebElement password_txtbox(WebDriver driver)
	{
	ele = driver.findElement(By.id("pass"));
	return ele;
	}
	
	
}
