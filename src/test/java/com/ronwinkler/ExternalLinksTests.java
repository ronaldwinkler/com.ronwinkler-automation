package com.ronwinkler;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ronwinkler.TestComponents.BaseTest;

//Test external links to other pages.
// TODO: Replace Thread.sleep with explicit wait
public class ExternalLinksTests extends BaseTest{
	
	@Test
	public void linkedinMenuTest() {
		homePage.getMenuLink("linkedin").click();
		Assert.assertEquals(homePage.getChildWindowUrl(), "https://www.linkedin.com/in/ronaldwinkler/?original_referer=");
	}
	
	@Test
	public void linkedinFooterTest() throws InterruptedException {
		homePage.scrollToBottom();
		Thread.sleep(2000);
		homePage.getFooterLink("linkedin").click();
		Assert.assertEquals(homePage.getChildWindowUrl(), "https://www.linkedin.com/in/ronaldwinkler/?original_referer=");
	}
	
	@Test
	public void linkedinContactTest() throws InterruptedException {
		homePage.scrollToBottom();
		Thread.sleep(2000);
		homePage.getContactLink("linkedin").click();
		Assert.assertEquals(homePage.getChildWindowUrl(), "https://www.linkedin.com/in/ronaldwinkler/?original_referer=");
	}
	
	@Test
	public void twitterMenuTest() {
		homePage.getMenuLink("twitter").click();
		Assert.assertEquals(homePage.getChildWindowUrl(), "https://twitter.com/rwinklertx");
	}
	
	@Test
	public void twitterFooterTest() throws InterruptedException {
		homePage.scrollToBottom();
		Thread.sleep(2000);
		homePage.getFooterLink("twitter").click();
		Assert.assertEquals(homePage.getChildWindowUrl(), "https://twitter.com/rwinklertx");
	}
	
	@Test
	public void twitterContactTest() throws InterruptedException {
		homePage.scrollToBottom();
		Thread.sleep(2000);
		homePage.getContactLink("twitter").click();
		Assert.assertEquals(homePage.getChildWindowUrl(), "https://twitter.com/rwinklertx");
	}
	
	@Test
	public void githubMenuTest() {
		homePage.getMenuLink("github").click();
		Assert.assertEquals(homePage.getChildWindowUrl(), "https://github.com/ronaldwinkler");
	}
	
	@Test
	public void githubFooterTest() throws InterruptedException {
		homePage.scrollToBottom();
		Thread.sleep(2000);
		homePage.getFooterLink("github").click();
		Assert.assertEquals(homePage.getChildWindowUrl(), "https://github.com/ronaldwinkler");
	}
	
	@Test
	public void codepenMenuTest() {
		homePage.getMenuLink("codepen").click();
		Assert.assertEquals(homePage.getChildWindowUrl(), "https://codepen.io/moreron");
	}
	
	@Test
	public void codepenFooterTest() throws InterruptedException {
		homePage.scrollToBottom();
		Thread.sleep(2000);
		homePage.getFooterLink("codepen").click();
		Assert.assertEquals(homePage.getChildWindowUrl(), "https://codepen.io/moreron");
	}
	
	@Test
	public void replitMenuTest() {
		homePage.getMenuLink("replit").click();
		Assert.assertEquals(homePage.getChildWindowUrl(), "https://replit.com/@moreron?tab=repls");
	}
	
	@Test
	public void replitFooterTest() throws InterruptedException {
		homePage.scrollToBottom();
		Thread.sleep(2000);
		homePage.getFooterLink("replit").click();
		Assert.assertEquals(homePage.getChildWindowUrl(), "https://replit.com/@moreron?tab=repls");
	}
	
	@Test
	public void donationFooterTest() throws InterruptedException {
		homePage.scrollToBottom();
		Thread.sleep(2000);
		homePage.getFooterLink("donation").click();
		Assert.assertEquals(homePage.getChildWindowUrl(), "https://www.paypal.com/paypalme/rwtx");
	}
	
	@Test
	public void resumeFooterTest() throws InterruptedException {
		homePage.scrollToBottom();
		Thread.sleep(2000);
		homePage.getFooterLink("resume").click();
		Assert.assertEquals(homePage.getChildWindowUrl(), "http://localhost:3000/docs/Winkler_Ronald_Resume.pdf");
	}
	
	@Test
	public void resumeContactTest() throws InterruptedException {
		homePage.scrollToBottom();
		Thread.sleep(2000);
		homePage.getContactLink("resume").click();
		Assert.assertEquals(homePage.getChildWindowUrl(), "http://localhost:3000/docs/Winkler_Ronald_Resume.pdf");
	}
	
	@Test
	public void resumeSplashTest() throws InterruptedException {
		homePage.getSplashLink("resume").click();
		Assert.assertEquals(homePage.getChildWindowUrl(), "http://localhost:3000/docs/Winkler_Ronald_Resume.pdf");
	}
	
	@Test
	public void copyEmailTest() throws HeadlessException, UnsupportedFlavorException, IOException, InterruptedException {
		homePage.scrollToBottom();
		Thread.sleep(2000);
		homePage.getContactLink("email").click();
		String data = (String) Toolkit.getDefaultToolkit()
                .getSystemClipboard().getData(DataFlavor.stringFlavor); 
		Assert.assertEquals(data, "rwinkler.dev@gmail.com");
	}
}
