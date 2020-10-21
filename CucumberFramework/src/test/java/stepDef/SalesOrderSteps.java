package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DeskPage;
import pageObjects.HomePage;
import pageObjects.ItemPage;
import pageObjects.LoginPage;
import pageObjects.SalesOrderPage;
import pageObjects.SelleingPage;

public class SalesOrderSteps {
	

	HomePage homePageObj;
	LoginPage loginPageObj;
	ItemPage itemPageObj;
	DeskPage deskPageObj;
	SelleingPage sellingPageObj;
	

	@Given("user is on sales order page")
	public void user_is_on_sales_order_page() {
		homePageObj= new HomePage();
		homePageObj.loginLink.click();
		loginPageObj= new LoginPage();
		loginPageObj.loginWithValidValues();
		deskPageObj= new DeskPage();
		deskPageObj.clickOnSellingModule();
		
		sellingPageObj = new SelleingPage();
		sellingPageObj.clickOnSalesOrder();
		
	}

	@When("user clicks on New to create new order")
	public void user_clicks_on_new_to_create_new_order() {
	
		SalesOrderPage salesPageObj= new SalesOrderPage();
		salesPageObj.clickOnNewButton();
	}

	@When("user provides Customer as {string}")
	public void user_provides_customer_as(String string) {
		
	}

	@When("user provides itemCode as {string}")
	public void user_provides_item_code_as(String string) {
		
	}

	@When("user provied quantity as {int}")
	public void user_provied_quantity_as(Integer int1) {
		
	}

	@When("user saves the order")
	public void user_saves_the_order() {
		
	}

	@Then("system should display missing field popup for Delivery Date")
	public void system_should_display_missing_field_popup_for_delivery_date() {
		
	}

}
