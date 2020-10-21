package stepDef;

import java.util.List;

import javax.swing.plaf.synth.SynthSpinnerUI;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestDataAndTagDemoSteps {

	@Given("there are {int} bananas")
	public void there_are_bananas(Integer numberOfBananas) {
		System.out.println(numberOfBananas);

	}

	@When("rohan ate {int} bananas")
	public void rohan_ate_bananas(Integer rohanAte) {
		System.out.println(rohanAte);
	}

	@Then("total number of bananas remaining should be {int}")
	public void total_number_of_bananas_remaining_should_be(Integer expectedRemaining) {
		System.out.println(expectedRemaining);
	}
	int cntEach= 0;
	@Given("there are below fruits with each of {int} count")
	public void there_are_below_fruits_with_each_of_count(Integer countForEachFruit,DataTable data ) {
   
		System.out.println(countForEachFruit); 
		cntEach= countForEachFruit;
		
		List<String> allFruits= data.asList();
		System.out.println(allFruits);
		
		
		
		String fruit1= allFruits.get(0);
		System.out.println(fruit1);
	}

	@When("rohan ate {int} of each fruit")
	public void rohan_ate_of_each_fruit(Integer rohanAte) {
	System.out.println(rohanAte);
	cntEach= cntEach- rohanAte;
	
	}

	@Then("print remaining fruits count")
	public void print_remaining_fruits_count() {
		System.out.println(cntEach);
	}

	@Given("browser is opened")
	public void browser_is_opened() {
	    System.out.println("//code to check browser open will come here ");
	}


/*@When("ram ate {int} of each fruit")
public void ram_ate_of_each_fruit(Integer int1) {
    System.out.println("ram ate..");
}*/

}
