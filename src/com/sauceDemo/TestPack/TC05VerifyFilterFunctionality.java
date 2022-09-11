package com.sauceDemo.TestPack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMPack.HomePOMClass;
import com.sauceDemo.POMPack.LoginPOMClass;
import com.sauceDemo.UtilityPack.TakeScreenShot;

public class TC05VerifyFilterFunctionality extends Test_BaseClass 
{
	
	
	
	@Test
	public void filterFunction()
	{
		HomePOMClass hm=new HomePOMClass(driver);
		
		hm.selectdropDownSelect();
		
		String ExpectedResult="Price (high to low)";
		
		String ActualResult=hm.getOptionSelect();
		
		if(ExpectedResult.equals(ActualResult))
		{
			System.out.println("test case passed");
		}
		else
		{
			System.out.println("test case failed");
		}
	}
		
	}


