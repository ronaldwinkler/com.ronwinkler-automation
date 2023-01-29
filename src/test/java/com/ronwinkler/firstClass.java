package com.ronwinkler;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ronwinkler.TestComponents.BaseTest;

public class firstClass extends BaseTest {
	
	@Test
	public void firstTest() throws IOException {	
		Assert.assertEquals(driver.findElement(By.id("about-title")).getText(), "About Me");
	}

	@Test
	public void secondTest() {
		Assert.assertEquals(driver.findElement(By.id("projects-title")).getText(),"Projects");
	}

	@Test
	public void thirdTest() {
		homePage.getMenuLink("twitter").click();
		System.out.println(driver.getCurrentUrl());
		//switch browser context
		String childUrl = homePage.getChildWindowUrl();
		System.out.println(childUrl);
	}

	
	@Test
	public void fourthTest() {
		softAssert.assertTrue(driver.findElement(By.id("about-title")).isDisplayed());
		softAssert.assertTrue(driver.findElement(By.id("projects-title")).isDisplayed());
		softAssert.assertFalse(driver.findElement(By.id("about-headshot")).isDisplayed());
		softAssert.assertAll();
	}
	
	@Test
	public void fifthTest() throws InterruptedException {
		Long value = homePage.getViewportPosition();
		System.out.println("starting position: " + value);
		
		driver.findElement(By.cssSelector("div[id='menu-links'] a[href='#about']")).click();
		Thread.sleep(2000);
		Long value2 = homePage.getViewportPosition();
		System.out.println("ending position: " + value2);
		
	}
	
	@Test()
	public void sixthTest() throws InterruptedException {
		homePage.getContactFormName().sendKeys("Bobby");
		homePage.getContactFormEmail().sendKeys("bobby@bob.com");
		homePage.getContactFormMessage().sendKeys("Hello World!");
		homePage.getContactForm().submit();
		Thread.sleep(2000);
		Assert.assertTrue(homePage.getContactFormSuccessMessage().isDisplayed());
		//TODO: Fix click on 'submit'. Manually click with ajax mouse interaction?
	}
	
	@Test
	public void seventhTest() {
		homePage.getSplashLink("learnMore").click();
		System.out.println(homePage.getViewportPosition());
	}
}
