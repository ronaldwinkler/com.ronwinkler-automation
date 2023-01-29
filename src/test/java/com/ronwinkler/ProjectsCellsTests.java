package com.ronwinkler;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.ronwinkler.TestComponents.BaseTest;

public class ProjectsCellsTests extends BaseTest {
	
	@Test
	public void ProjectInfoCellsDisplayedTest() throws InterruptedException {
		homePage.scrollToPosition(1500);
		Thread.sleep(2000);
		
		Actions a = new Actions(driver);
		
		for(int i = 0; i < homePage.getProjectCells().size();i++) {
			a.moveToElement(homePage.getProjectCells().get(i)).perform();
			softAssert.assertTrue(homePage.getProjectInfoCells().get(i).isDisplayed());
			softAssert.assertTrue(homePage.getProjectInfoTitles().get(i).isDisplayed());
			softAssert.assertTrue(homePage.getProjectInfoDescriptions().get(i).isDisplayed());
			softAssert.assertTrue(homePage.getProjectInfoButtons().get(i).isDisplayed());
		}
		
		softAssert.assertAll();
	}
	
	@Test
	public void allProjectCellsDisplayed() {
		softAssert.assertEquals(homePage.getProjectCells().size(), 6);
		
		for (int i = 0; i < homePage.getProjectCells().size();i++) {
			softAssert.assertTrue(homePage.getProjectCells().get(i).isDisplayed());
		}
		
		softAssert.assertAll();
	}
}
