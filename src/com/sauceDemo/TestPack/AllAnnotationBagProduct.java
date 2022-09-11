package com.sauceDemo.TestPack;

import org.testng.annotations.Test;

import com.sauceDemo.POMPack.HomePOMClass;

public class AllAnnotationBagProduct extends Test_BaseClassWithAllAnnotation
{
	@Test
	public void bagProductAddToCart()
	{
HomePOMClass lg=new HomePOMClass(driver);
		
	  	lg.clickonBagProduct();
		System.out.println("clicked bag product");
		
		String actualResult="1";
		
		String ExpectedResult=lg.getTextFromAddToCart();
		
		if(ExpectedResult.equals(ExpectedResult))
		{
			System.out.println("test case passed");
		}
		else
		{
			System.out.println("test case Failed");
		}
	}
	

}
