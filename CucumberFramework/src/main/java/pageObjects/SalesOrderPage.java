package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class SalesOrderPage extends TestBase{
	
	
	@FindBy(how= How.XPATH, using= "//button//span[@data-label='New']")
	WebElement newButton;
	
	
	
	public SalesOrderPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnNewButton()
	{
		newButton.click();
	}
	
}