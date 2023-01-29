package com.ronwinkler.pageObjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	// Constructor
	public HomePage(WebDriver driver) {
		// initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	

	/* --- PageFactory Elements --- */
	@FindBy(id = "port-logo")
	WebElement menuLogo;
	
	// Titles:
	@FindBy(id = "about-title")
	WebElement aboutTitle;
	
	@FindBy(id = "skills-title")
	WebElement aboutSkillsTitle;
	
	@FindBy(id = "projects-title")
	WebElement projectsTitle;
	
	@FindBy(id = "contact-title")
	WebElement contactTitle;
	
	// Splash Elements:
	@FindBy(css = "iframe[title='splash-iframe']")
	WebElement splashGraphic;
	
	
	// About Elements:
	@FindBy(css = "iframe[title='3D Ronald']")
	WebElement aboutGraphic;
	
	@FindBy(id = "about-headshot")
	WebElement aboutHeadShot;
	
	@FindBy(id = "about-summary")
	WebElement aboutSummary;
	
	@FindBy(id = "skills-blocks")
	WebElement aboutSkillsBlocks;
	
	
	
	
	
	// Splash Links
	@FindBy(id = "learn-more")
	WebElement splashLearnMore;
	
	@FindBy(id = "resume")
	WebElement splashResume;
	
	
	
	// Menu Links
	@FindBy(css = "div[id='menu-socials'] div[title='Linkedin'] a.socials-link")
	WebElement menuLinkedin;

	@FindBy(css = "div[id='menu-socials'] div[title='Twitter'] a.socials-link")
	WebElement menuTwitter;

	@FindBy(css = "div[id='menu-socials'] div[title='Github'] a.socials-link")
	WebElement menuGithub;

	@FindBy(css = "div[id='menu-socials'] div[title='Codepen'] a.socials-link")
	WebElement menuCodepen;

	@FindBy(css = "div[id='menu-socials'] div[title='Replit'] a.socials-link")
	WebElement menuReplit;

	@FindBy(css = "div[id='menu-links'] a[href='#about']")
	WebElement menuAbout;

	@FindBy(css = "div[id='menu-links'] a[href='#projects']")
	WebElement menuProjects;

	@FindBy(css = "div[id='menu-links'] a[href='#contact']")
	WebElement menuContact;

	// Footer Links
	@FindBy(css = "div[id='footer-socials'] a[title='Linkedin'] i")
	WebElement footerLinkedin;

	@FindBy(css = "div[id='footer-socials'] a[title='Twitter'] i")
	WebElement footerTwitter;

	@FindBy(css = "div[id='footer-socials'] a[title='Github'] i")
	WebElement footerGithub;

	@FindBy(css = "div[id='footer-socials'] a[title='Codepen'] i")
	WebElement footerCodepen;

	@FindBy(css = "div[id='footer-socials'] a[title='Replit'] img")
	WebElement footerReplit;

	@FindBy(css = "div[id='fc-right-links'] a[title='Resume']")
	WebElement footerResume;

	@FindBy(css = "div[id='fc-right-links'] a[title='Paypal']")
	WebElement footerDonation;

	@FindBy(css = "div[id='fc-center-links'] a[title='About']")
	WebElement footerAbout;

	@FindBy(css = "div[id='fc-center-links'] a[title='Projects']")
	WebElement footerProjects;

	@FindBy(css = "div[id='fc-center-links'] a[title='Contact']")
	WebElement footerContact;

	@FindBy(css = "div[id='fc-center-return'] a[title='Return to top']")
	WebElement footerHome;
	
	// Contact - Links
	@FindBy(css = "div[id='info-blocks'] div a[title='Resume']")
	WebElement contactResume;
	
	@FindBy(id = "email-link")
	WebElement contactEmail;
	
	@FindBy(css = "div[id='info-blocks'] div a[title='Linkedin']")
	WebElement contactLinkedin;
	
	@FindBy(css = "div[id='info-blocks'] div a[title='Twitter']")
	WebElement contactTwitter;
	
	
	// Contact - Message Form
	@FindBy(id="fname")
	WebElement contactFormName;
	
	@FindBy(id="fmail")
	WebElement contactFormEmail;
	
	@FindBy(id="fmessage")
	WebElement contactFormMessage;
	
	@FindBy(css = "div[id='message-form'] form")
	WebElement contactForm;
	
	@FindBy(id="message-success")
	WebElement contactFormSuccessMessage;

	// Project Cells
	
	@FindBy(css = "div.project-cell")
	List<WebElement> projectCells;
	
	@FindBy(css = "div.p-info")
	List<WebElement> projectInfoCells;
	
	@FindBy(css = "div.p-info-title")
	List<WebElement> projectInfoTitles;
	
	@FindBy(css = "div.p-info-desc")
	List<WebElement> projectInfoDescriptions;
	
	@FindBy(css = "div.p-info-buttons")
	List<WebElement> projectInfoButtons;
	
	
	public List<WebElement> getProjectCells() {
		return projectCells;
	}
	
	public List<WebElement> getProjectInfoCells() {
		return projectInfoCells;
	}
	
	public List<WebElement> getProjectInfoTitles() {
		return projectInfoTitles;
	}
	
	public List<WebElement> getProjectInfoDescriptions() {
		return projectInfoDescriptions;
	}
	
	public List<WebElement> getProjectInfoButtons() {
		return projectInfoButtons;
	}
	
	
	/* --- ActionMethods --- */
	public void testMethod() {
		System.out.println("Hello World!");
	}

	public void goTo() {
		driver.get("http://localhost:3000/");
	}
	
	public void scrollToBottom() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,3000)", "");
	}
	
	public void scrollToPosition(int position) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,"+ position + ")", "");
	}
	
	public WebElement getMenuLogo() {
		return menuLogo;
	}
	
	// Splash Tab
	public WebElement getSplashGraphic() {
		return splashGraphic;
	}
	
	
	// About Tab
	public WebElement getAboutTitle() {
		return aboutTitle;
	}
	
	public WebElement getAboutGraphic() {
		return aboutGraphic;
	}
	
	public WebElement getAboutHeadShot() {
		return aboutHeadShot;
	}
	
	public WebElement getSkillsTitle() {
		return aboutSkillsTitle;
	}
	
	public WebElement getSkillsBlocks() {
		return aboutSkillsBlocks;
	}
	
	
	// Message Form
	public WebElement getContactFormName() {
		return contactFormName;
	}
	public WebElement getContactFormEmail() {
		return contactFormEmail;
	}
	public WebElement getContactFormMessage() {
		return contactFormMessage;
	}
	public WebElement getContactForm() {
		return contactForm;
	}
	
	public WebElement getContactFormSuccessMessage() {
		return contactFormSuccessMessage;
	}

	public String getChildWindowUrl() {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();

		driver.switchTo().window(childWindow);
		return driver.getCurrentUrl();
	}

	public Long getViewportPosition() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Long value = (Long) executor.executeScript("return window.pageYOffset;");
		return value;
	}
	
	public String getHtmlError(WebElement el) {
		WebElement field = el;
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String message = (String)js.executeScript("return arguments[0].validationMessage;", field);
		return message;
	}

	// returns menu links WebElements
	public WebElement getMenuLink(String link) {
		WebElement myEle = null;

		switch (link) {
		case "linkedin":
			myEle = menuLinkedin;
			break;
		case "twitter":
			myEle = menuTwitter;
			break;
		case "github":
			myEle = menuGithub;
			break;
		case "codepen":
			myEle = menuCodepen;
			break;
		case "replit":
			myEle = menuReplit;
			break;
		case "about":
			myEle = menuAbout;
			break;
		case "projects":
			myEle = menuProjects;
			break;
		case "contact":
			myEle = menuContact;
			break;
		}

		return myEle;
	}

	// returns footer links WebElements
	public WebElement getFooterLink(String link) {
		WebElement myEle = null;

		switch (link) {
		case "linkedin":
			myEle = footerLinkedin;
			break;
		case "twitter":
			myEle = footerTwitter;
			break;
		case "github":
			myEle = footerGithub;
			break;
		case "codepen":
			myEle = footerCodepen;
			break;
		case "replit":
			myEle = footerReplit;
			break;
		case "resume":
			myEle = footerResume;
			break;
		case "donation":
			myEle = footerDonation;
			break;
		case "about":
			myEle = footerAbout;
			break;
		case "projects":
			myEle = footerProjects;
			break;
		case "contact":
			myEle = footerContact;
			break;
		case "home":
			myEle = footerHome;
			break;
		}

		return myEle;
	}
	
	// Returns Contact section links
	public WebElement getContactLink(String link) {
		WebElement el = null;
		
		switch(link) {
		case "resume":
			el = contactResume;
			break;
		case "email":
			el = contactEmail;
			break;
		case "linkedin":
			el = contactLinkedin;
			break;
		case "twitter":
			el = contactTwitter;
			break;
		}
		
		return el;
	}
	
	// Returns Splash links
	public WebElement getSplashLink(String link) {
		WebElement el= null;
		if(link.equalsIgnoreCase("learnmore")) {
			el = splashLearnMore;
		}else if(link.equalsIgnoreCase("resume")){
			el = splashResume;
		}
		
		return el;
	}

}
