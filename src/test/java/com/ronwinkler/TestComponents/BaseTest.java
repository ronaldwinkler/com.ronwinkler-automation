package com.ronwinkler.TestComponents;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;


import com.ronwinkler.pageObjects.HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;
	public HomePage homePage;
	public SoftAssert softAssert;
	
	// constructor
	
	
	
	public WebDriver initializeDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\ronwinkler\\resources\\GlobalData.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		String platform = prop.getProperty("platform");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			//chrome browser setup
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			// firefox setup
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			//MS Edge setup
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		
		if(platform.equalsIgnoreCase("mobile")) {
			Dimension dimension = new Dimension(600, 1080);
			driver.manage().window().setSize(dimension);
		}else if(platform.equalsIgnoreCase("widescreen")) {
			// wide-screen dimensions setup
		}else {
			// default ['desktop'] setup
			driver.manage().window().maximize();
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	
	@BeforeMethod(alwaysRun=true)
	public HomePage launchApp() throws IOException {
		driver = initializeDriver();
		softAssert = new SoftAssert();
		homePage = new HomePage(driver);
		homePage.goTo();
		return homePage;
	}
	
	@AfterMethod(alwaysRun=true)
	public void closeApp() {
		driver.quit();
	}
	
	public String getScreenShot(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
		FileUtils.copyFile(source,file);
		return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
		
	}
}
