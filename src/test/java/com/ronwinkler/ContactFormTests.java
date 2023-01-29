package com.ronwinkler;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ronwinkler.TestComponents.BaseTest;


//Tests for sending messages via the contact form.
public class ContactFormTests extends BaseTest {
	
	@Test
	public void successfulFormSubmitTest() throws InterruptedException {
		homePage.getContactFormName().sendKeys("Bobby");
		homePage.getContactFormEmail().sendKeys("bobby@bob.com");
		homePage.getContactFormMessage().sendKeys("Hello World!");
		homePage.getContactForm().submit();
		Thread.sleep(2000);
		softAssert.assertFalse(homePage.getContactFormName().isEnabled());
		softAssert.assertFalse(homePage.getContactFormEmail().isEnabled());
		softAssert.assertFalse(homePage.getContactFormMessage().isEnabled());
		softAssert.assertAll();
		Assert.assertTrue(homePage.getContactFormSuccessMessage().isDisplayed());
	}
	
	@Test
	public void failNameFormSubmitTest() {
		homePage.getContactFormEmail().sendKeys("bobby@bob.com");
		homePage.getContactFormMessage().sendKeys("Hello World!");
		homePage.getContactForm().submit();
		Assert.assertEquals(homePage.getHtmlError(homePage.getContactFormName()),"Please fill out this field.");
	}
	
	@Test
	public void failEmailFormSubmitTest() {
		homePage.getContactFormName().sendKeys("Bobby");
		homePage.getContactFormMessage().sendKeys("Hello World!");
		homePage.getContactForm().submit();
		Assert.assertEquals(homePage.getHtmlError(homePage.getContactFormEmail()),"Please fill out this field.");
	}
	
	@Test
	public void failMessageFormSubmitTest() {
		homePage.getContactFormName().sendKeys("Bobby");
		homePage.getContactFormEmail().sendKeys("bobby@bob.com");
		homePage.getContactForm().submit();
		Assert.assertEquals(homePage.getHtmlError(homePage.getContactFormMessage()),"Please fill out this field.");
	}
	
}
