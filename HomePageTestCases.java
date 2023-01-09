package com.codemind.b3project.testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.codemind.b3project.pages.HomePage;

public class HomePageTestCases {

	WebDriver driver;
	HomePage homePage;

	@BeforeMethod
	public void initilizeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\classworkspace\\com.codemind\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@Test
	public void verifyValidLogin() {
		homePage = new HomePage(driver);
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		homePage.setUserName();
		homePage.getUserName().sendKeys("test1");
		homePage.setPassword();
		homePage.getPassword().sendKeys("test1");
		homePage.setLoginButton();
		homePage.getLoginButton().click();
	}
}
