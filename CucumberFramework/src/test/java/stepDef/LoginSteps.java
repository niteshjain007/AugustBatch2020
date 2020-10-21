package stepDef;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;

@RunWith(Cucumber.class)
public class LoginSteps {
	WebDriver dr= null;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
		dr = new ChromeDriver(); 
		
		dr.get("https://test.techlift.in/");
		
		WebElement loginLink= dr.findElement(By.linkText("Login"));
		loginLink.click();
	
	}

	
	@When("^user specify invalid username and valid password$")
	public void user_specify_invalid_username_and_valid_password()
	{
		WebElement  emailTxt = dr.findElement(By.id("login_email"));
		emailTxt.sendKeys("testology.qa.learning@gmail.com");
		
		WebElement  passwordTxt = dr.findElement(By.id("login_password"));
		passwordTxt.sendKeys("wrongpassword");
	}
	
	@And("^user clicks on submit button$")
	public void user_clicks_on_submit_button() throws InterruptedException
	{
		dr.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(2000);
	}
	
	@Then("^error message should be displayed$")
	public void error_message_should_be_displayed() throws InterruptedException
	{
		Thread.sleep(2000);
		String errorMsg= dr.findElement(By.cssSelector("span[class *='indicator'][class *= 'red']"))
				         .getText();
		
		Assert.assertTrue(errorMsg.equalsIgnoreCase("Invalid Login. Try again."));
	}
	

	@When("user specify valid username {string} and valid password as {string}")
	public void user_specify_valid_username_and_valid_password_as(String email, String pwd) {
	    
		WebElement  emailTxt = dr.findElement(By.id("login_email"));
		emailTxt.sendKeys(email);
		
		WebElement  passwordTxt = dr.findElement(By.id("login_password"));
		passwordTxt.sendKeys(pwd);
	}
    
    @Then("^user should see desk page$")
    public void user_should_see_desk_page() throws Throwable {
    	String currentPageurl= dr.getCurrentUrl();
    	Assert.assertTrue(currentPageurl.contains("test.techlift.in/desk"));
       
    }
	
    @When("user specify below credential")
    public void user_specify_below_credential(DataTable dataTable) {
    	List<String> creddata= dataTable.asList();
    	
    	String email= creddata.get(0);
    	String password= creddata.get(1);
    	
    	WebElement  emailTxt = dr.findElement(By.id("login_email"));
		emailTxt.sendKeys(email);
		
		WebElement  passwordTxt = dr.findElement(By.id("login_password"));
		passwordTxt.sendKeys(password);
    }

}
