package com.sauceDemo.TestPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMPack.BuyPagePOMClass;
import com.sauceDemo.POMPack.CartPagePOMClass;
import com.sauceDemo.POMPack.HomePOMClass;
import com.sauceDemo.POMPack.LoginPOMClass;
import com.sauceDemo.POMPack.OverviewPOMClass;
import com.sauceDemo.UtilityPack.TakeScreenShot;

public class TC06VerifyBuyProductFunctionality extends Test_BaseClass 
{
	
	
    @Test
	public void buyProduct()	
	{
	
	HomePOMClass lm=new HomePOMClass(driver);
	
	lm.clickonBagProduct();
	
	System.out.println("bag product selected");
	lm.clickonBagProductButton();
	System.out.println("clicked on bag product button");
	
	CartPagePOMClass cp=new CartPagePOMClass(driver);
	
	cp.clickcheckoutButton();
	System.out.println("check button is clicked");
	
	BuyPagePOMClass bp=new BuyPagePOMClass(driver);
	
	bp.sendFirstNmae();
	System.out.println("first name is entered");
	bp.sendLastNmae();
	System.out.println("last name is entered");
	bp.sendPinCode();
	System.out.println("pin code entered");
	bp.clickContinueButton();
	System.out.println("clicked on continue button");
	
	
	OverviewPOMClass ov=new OverviewPOMClass(driver);
	ov.clickFinishButton();
	
	
	String ActualResult=ov.getTextOrderPlaced();
	System.out.println(ActualResult);
	String ExpectedResult="THANK YOU FOR YOUR ORDER";
	System.out.println(ExpectedResult);
	
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
