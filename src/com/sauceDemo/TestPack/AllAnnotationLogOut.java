package com.sauceDemo.TestPack;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.sauceDemo.POMPack.HomePOMClass;

public class AllAnnotationLogOut extends Test_BaseClassWithAllAnnotation 
{
	
	@Test
	public void verifyLogOut()
	{
		
		String ExpectedResult="Swag Labs";
		
		String ActualResult=driver.getTitle();
		
		
		if(ActualResult.equals(ExpectedResult))
		{
			System.out.println("test case Passed");
		}
		
		else
		{
			System.out.println("test case Failed");
		}
	}
	

}
