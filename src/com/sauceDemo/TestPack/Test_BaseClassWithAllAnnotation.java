package com.sauceDemo.TestPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.sauceDemo.POMPack.HomePOMClass;
import com.sauceDemo.POMPack.LoginPOMClass;

public class Test_BaseClassWithAllAnnotation 
{
	WebDriver driver;
	@BeforeClass()
	public void browserLaunch()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	
		 driver= new ChromeDriver();
		System.out.println("Browser is Opened");
		driver.manage().window().maximize();
		System.out.println("Browser is  Maximised");
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is Opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@BeforeMethod
	public void loginFunction()
	{
       LoginPOMClass login=new LoginPOMClass(driver);
		
		login.senKeysUsername();
		System.out.println("Username is entered");
		
		login.senkeysPassward();
		System.out.println("Password is Enterd");
		
		login.clickLoginButton();
		System.out.println("Click on Login Button");
		
	 }
	
	@AfterMethod
	public void loogoutFunction()
	{
        HomePOMClass lg=new HomePOMClass(driver);
		
		lg.clicksettingButton();
		System.out.println("setting button clicked");
		
		lg.clickLogOutButton();
		System.out.println("Logout Button is clicked");
	}
	
	@AfterClass
	public void BrowserClose()
	{
		driver.quit();
		 
		 System.out.println("Browser is Closed");
	}

}
