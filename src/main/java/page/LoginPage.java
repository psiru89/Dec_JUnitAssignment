package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class LoginPage {
	
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using= "input[value='on']") WebElement Toggle_Element;
	@FindBy(how = How.CSS, using= "input[name='data']") WebElement Name_Element;
	@FindBy(how = How.CSS, using= "input[value='Add']") WebElement Add_Element;
	@FindBy(how = How.CSS, using= "input[name='todo[8]']") WebElement Checked_Element;
	@FindBy(how = How.CSS, using= "input[value='Remove']") WebElement Remove_Element;
	
	
	public void clickOnToggleButton() {
		Toggle_Element.click();
		Assert.assertTrue("Is not valid", Toggle_Element.isDisplayed());;
	}

	public void insertAdd(String add) {
		Name_Element.sendKeys(add);
		Assert.assertTrue("Name is not added", Name_Element.isDisplayed());
		
	}
	
	public void clickOnAddButton() {
		Add_Element.click();
	}
	
	public void clickOnCheckedButton() {
		Checked_Element.click();
	}
	
	public void clickOnRemoveButton() {
		Remove_Element.click();
		Assert.assertTrue("Name is not removed", Remove_Element.isDisplayed());
	}
}
