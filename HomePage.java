package com.codemind.b3project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	WebElement userName;
	WebElement password;
	WebElement loginButton;

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName() {
		userName = driver.findElement(By.xpath("//input[@name='userName']"));
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword() {
		password = driver.findElement(By.xpath("//input[@name='password']"));
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton() {
		loginButton = driver.findElement(By.xpath("//input[@name='submit']"));
	}

}
