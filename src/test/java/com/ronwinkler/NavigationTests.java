package com.ronwinkler;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ronwinkler.TestComponents.BaseTest;

//Tests for navigating to different sections of the website [about, projects, contact] via the menu & footer links.
public class NavigationTests extends BaseTest {
	//TODO: replace thread.sleep with explicit waits
	
	@Test
	public void aboutMenuTest() throws InterruptedException {
		homePage.getMenuLink("about").click();
		Thread.sleep(2000);
		Assert.assertTrue(homePage.getViewportPosition() >= 500);
	}
	
	@Test
	public void projectsMenuTest() throws InterruptedException {
		homePage.getMenuLink("projects").click();
		Thread.sleep(2000);
		Assert.assertTrue(homePage.getViewportPosition() >= 1372);
	}
	
	@Test
	public void contactMenuTest() throws InterruptedException {
		homePage.getMenuLink("contact").click();
		Thread.sleep(2000);
		Assert.assertTrue(homePage.getViewportPosition() >= 2332);
	}
	
	@Test
	public void aboutFooterTest() throws InterruptedException {
		homePage.scrollToBottom();
		Thread.sleep(2000);
		homePage.getFooterLink("about").click();
		Thread.sleep(2000);
		Assert.assertTrue(homePage.getViewportPosition() <= 500);
	}
	
	@Test
	public void projectsFooterTest() throws InterruptedException {
		homePage.scrollToBottom();
		Thread.sleep(2000);
		homePage.getFooterLink("projects").click();
		Thread.sleep(2000);
		Assert.assertTrue(homePage.getViewportPosition() <= 1372);
	}
	
	@Test
	public void contactFooterTest() throws InterruptedException {
		homePage.scrollToBottom();
		Thread.sleep(2000);
		homePage.getFooterLink("contact").click();
		Thread.sleep(2000);
		Assert.assertTrue(homePage.getViewportPosition() <= 2332);
	}
	
	@Test
	public void homeFooterTest() throws InterruptedException {
		homePage.scrollToBottom();
		Thread.sleep(2000);
		homePage.getFooterLink("home").click();
		Thread.sleep(2000);
		Assert.assertTrue(homePage.getViewportPosition() == 0);
	}
	
	public void splashLearnMoreTest() throws InterruptedException {
		homePage.getSplashLink("learnMore").click();
		Thread.sleep(2000);
		Assert.assertTrue(homePage.getViewportPosition() <= 500);
	}
	
}
