package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectMethods.HomePageOM;
import testData.TestData;

public class TestCase1 {
	
	public WebDriver driver;
	TestData tobj = new TestData();  //creating object of the class TestData. 
	HomePageOM homemobj= new HomePageOM();//objects of two different classes are created here and calling their methods here in below methods
	
	@BeforeTest
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Yogini\\chromedriver\\chromedriver.exe"); //location of browser in local drive
		WebDriver driver = new ChromeDriver(); 
		driver.get(tobj.url);
		System.out.println("Before test, browser is launched");
	}
	@Test
	public void Test1(WebDriver driver)
	{
		//homemobj.signIn(driver, tobj.UN, tobj.PSWD);   //calling signIn method using class object and sending values of username and password
																// using testData object.
		homemobj.signIn(driver, tobj.UN, tobj.PSWD);
		System.out.println("First test case is executed");
		//driver.navigate().back();
		//Thread.sleep(1000);
	}
	
	@Test
	public void Test2(WebDriver driver)
	{
		homemobj.signIn(driver,tobj.invalid_UN, tobj.invalid_PSWD); //invaid data to be passed
		System.out.println("Second test case is executed with invalid credentials.");
	}

}
