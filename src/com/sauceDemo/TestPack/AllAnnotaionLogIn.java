package com.sauceDemo.TestPack;

import org.testng.Assert;
import org.testng.annotations.Test;



public class AllAnnotaionLogIn extends Test_BaseClassWithAllAnnotation
{
	@Test
	public void verifyLogin() 
	{
		 String ExpectedResult="Swag Labs";
		 
		 String ActualResult=driver.getTitle();
		 
		 
		 Assert.assertEquals(ActualResult, ExpectedResult);
	}
	

}
