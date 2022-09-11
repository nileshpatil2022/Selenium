package com.sauceDemo.TestPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMPack.LoginPOMClass;



public class TC01VerifyLoginFunctionality extends Test_BaseClass
{
	
	
	
	@Test
	public void verifyLogin() 
	{
		 String ExpectedResult="Swag Labs";
		 
		 String ActualResult=driver.getTitle();
		 
		 
		 Assert.assertEquals(ActualResult, ExpectedResult);
	}
		 
			
	

}
