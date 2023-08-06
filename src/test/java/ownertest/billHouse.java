package ownertest;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import  io.cucumber.java.en.Then;
import  io.cucumber.java.en.When;
import owner.util.Tenant;

import java.util.Optional;


public class billHouse {
	 Tenant tenant;
	 int x;
	 @Given("inter number mounth and give the bill")
	 public void inter_number_mounth_and_give_the_bill() {
		 tenant = new Tenant();
	 }
	 
	 @When("I specify the number of months to rent as <{int}> and price for House <{int}>")
	 public void i_specify_the_number_of_months_to_rent_as_and_price_for_house(Integer int1, Integer int2) {
		 x= tenant.checkbill(int1 , int2 ) ;
	 }


@Then("the rent amount for the chosen house should be <{int}>")
public void the_rent_amount_for_the_chosen_house_should_be(Integer expectedRentAmount) {
	assertTrue(expectedRentAmount ==x);
}

 }