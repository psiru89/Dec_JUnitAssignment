package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
WebDriver driver;

    String name = "SirjanaPokharel";
	
	@Test
	public void validUserShouldBeAbleToLoginIn() {
		
	 driver = BrowserFactory.init(); 
	 LoginPage loginPage= PageFactory.initElements(driver,LoginPage.class);
	 loginPage.clickOnToggleButton();
	 loginPage.insertAdd(name);	
	 loginPage.clickOnAddButton();
	 loginPage.clickOnCheckedButton();
	 loginPage.clickOnRemoveButton();
	}

}
