package com.ronwinkler;



import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ronwinkler.TestComponents.BaseTest;

//test context is present on page [soft asserts on 'isDisplayed']
public class ContextTests extends BaseTest {
	
	
	
	@Test
	public void splashGraphicShownTest() {
		driver.manage().window().maximize();
		Assert.assertTrue(homePage.getSplashGraphic().isDisplayed());
	}
	
	@Test
	public void splashGraphicHiddenTest() {
		Dimension dimension = new Dimension(600, 1080);
		driver.manage().window().setSize(dimension);
		Assert.assertFalse(homePage.getSplashGraphic().isDisplayed());
		
	}
	
	@Test
	public void aboutGraphicShownTest() {
		driver.manage().window().maximize();
		Assert.assertTrue(homePage.getAboutGraphic().isDisplayed());
	}
	
	@Test
	public void aboutGraphicHiddenTest() {
		Dimension dimension = new Dimension(600, 1080);
		driver.manage().window().setSize(dimension);
		Assert.assertFalse(homePage.getAboutGraphic().isDisplayed());
		
	}
	
	@Test
	public void headShotHiddenTest() {
		driver.manage().window().maximize();
		Assert.assertFalse(homePage.getAboutHeadShot().isDisplayed());
	}
	
	@Test
	public void headShotShownTest() {
		Dimension dimension = new Dimension(600, 1080);
		driver.manage().window().setSize(dimension);
		Assert.assertTrue(homePage.getAboutHeadShot().isDisplayed());
		
	}
}
