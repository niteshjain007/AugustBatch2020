package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class SelleingPage extends TestBase{
	
	
	@FindBy(how= How.LINK_TEXT, using= "Item")
	WebElement itemLink;
	
	@FindBy(how= How.XPATH, using= "//button//span[@data-label='New']")
	WebElement NewBtn;
	
	@FindBy(how= How.PARTIAL_LINK_TEXT, using= "Sales Order")
	WebElement salesOrderLink;
	
	public SelleingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnItem()
	{
		itemLink.click();
		
	}

	public void clickOnSalesOrder() {
		salesOrderLink.click();
	}

}
